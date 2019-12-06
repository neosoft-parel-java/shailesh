package java8Features;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

/*
-It is defined in Iterable and Stream interface.
-Collection classes which extends Iterable interface can use forEach loop to iterate elements.
*/
        System.out.println("ForEach");
        list.stream().parallel().forEach( System.out::print );  //forEach() takes consumer object as parameter.

/*
There is also a method called forEachOrdered() which performs operation on stream w.r.t.
the encounter order of the stream. While forEach() is does not guarantee the order.
 */
        System.out.println();
        System.out.println("ForEachOrdered");
        list.stream().parallel().forEachOrdered( System.out::print );

        System.out.println();
        System.out.println("Stream ForEachOrdered");
        list.stream().forEachOrdered( System.out::print );
    }
}

// link => https://howtodoinjava.com/java8/java-stream-foreachordered/