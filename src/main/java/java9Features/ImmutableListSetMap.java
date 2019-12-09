package java9Features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableListSetMap {
    public static void main(String[] args) {
        /*
        List and Set interfaces have “of()” methods to create an empty or no-empty Immutable List or Set objects
        * */
        List immutableList = List.of("one","two","three");
//        immutableList.add("four");
        immutableList.forEach(System.out::println);

        Set immutableSet = Set.of("one","two","three");
//        immutableSet.add("four");
        immutableSet.forEach(System.out::println);

        Map immutableMap =  Map.of("a",1,"b",2);
    }
}
