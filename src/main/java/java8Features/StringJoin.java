package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoin {
    public static void main(String[] args) {
        //Sting.join() method
        //Syntax - String.join("delimiter", Array Or List of string);
        String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
        System.out.println(joinedString);

        //StringJoiner
        /* Syntax -
          StringJoiner(CharSequence delimiter)
          StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
        */
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("How")
                .add("To")
                .add("Do")
                .add("In")
                .add("Java");
        System.out.println(joiner);

        //Collectors.joining()
        List<String> stringList = Arrays.asList("How", "To", "Do", "In", "Java");
        String joinString = stringList
                .stream()
                .collect(Collectors.joining(", ","[","]"));
        System.out.println(joinString);
    }
}
