package java8Features.testStream;

import java8Features.streamExercise.model.Director;
import java8Features.streamExercise.model.Genre;
import java8Features.streamExercise.model.Movie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Address address = new Address(23, "gokuldham", "mumbai", "goregaon");
        Employee employee = new Employee("shailesh", 1L, address);
        Stream<List> stream = Stream.of(
                Arrays.asList(employee.getName()),
                Arrays.asList(employee.getId()),
                Arrays.asList(address.getArea(), address.getCity(), address.getSociety(), address.getRoomNo())
        );
        Stream flatStream = stream.flatMap(s -> s.stream());
        flatStream.forEach(System.out::println);

//        List<Director> directors = new ArrayList<>();
//        Map<Director, Genre> genres = new HashMap<>();
//        Stream<Map<Director, Genre>> stream = directors
//                .forEach(director -> director.getMovies()
//                .stream()
//                        .map(Movie::getGenres)
//                        .flatMap(Collection::stream)
//                        .map(genre -> genres.put(director, genre))
//                        .collect(Collectors.)
//                );
    }
}
