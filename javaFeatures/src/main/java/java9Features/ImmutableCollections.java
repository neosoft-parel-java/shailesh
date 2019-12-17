package java9Features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {
    public static void main(String[] args) {
        /*
        List and Set interfaces have “of()” methods to create an empty or no-empty Immutable List or Set objects

        Characteristics :
        -- These lists are immutable. Elements cannot be added, removed, or replaced in these lists.
             Calling any mutator method (i.e. add, addAll, clear, remove, removeAll, replaceAll)
             will always cause UnsupportedOperationException to be thrown.
        -- They do not allow null elements. Attempts to add null elements result in NullPointerException.
        -- They are serializable if all elements are serializable.
        -- The order of elements in the list is the same as the order of the provided arguments,
            or of the elements in the provided array.

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
