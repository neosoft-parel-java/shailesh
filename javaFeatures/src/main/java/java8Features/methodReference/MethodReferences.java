package java8Features.methodReference;

/*
It is a special type of lambda function.
*/

// link => https://www.baeldung.com/java-method-references

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MethodReferences {
    public static void main(String[] args){
        // A)Reference to static method:
        System.out.println("-----------Reference to static method--------------:");
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

        //using lambda expressions
        messages.forEach(word -> StringUtils.capitalize(word));

        //using method reference
        messages.forEach(StringUtils::capitalize);

        messages.forEach(System.out::println);

        //B)Reference to an Instance Method:
        System.out.println("-----------Reference to Instance method------------------------:");
        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
        //using lambda expressions
        numbers = numbers.stream()
                .sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
        //using method reference
        numbers = numbers.stream()
                .sorted(Integer::compareTo).collect(Collectors.toList());
        numbers.forEach(System.out::println);

        System.out.println();
        //C)Reference to a Constructor:
        System.out.println("-----------Reference to a Constructor------------------------:");
        List<String > bikeBrands = Arrays.asList("KTM", "RoyalEnfield", "Ducati");

        Bicycle[] bikeBrand = bikeBrands.stream()
                .map(Bicycle::new)
                .toArray(Bicycle[]::new);

        bikeBrands.forEach(System.out::println);
    }
}
