package java8Features.streamExercise;

import java8Features.streamExercise.dao.CountryDao;
import java8Features.streamExercise.dao.InMemoryWorldDao;
import java8Features.streamExercise.model.City;
import java8Features.streamExercise.model.Director;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        //Find the highest populated city of each country:
        CountryDao countryDao= InMemoryWorldDao.getInstance();
        List<City> cities = countryDao.findAllCountries()
                .stream()
                .map(country -> country.getCities()
                .stream()
                .max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        cities.stream().forEach(System.out::println);

    }
}
