package java10Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class APIChanges {
    public static void main(String args[]){
        List<String> actors=new ArrayList();
        actors.add("Ajay");
        actors.add("Akshay");
        System.out.println(actors);  //[Ajay, Akshay]

        //Creates an UnModifiable List
        List<String> copyActors=List.copyOf(actors);
        System.out.println(copyActors);  //[Ajay, Akshay]

        //copyActors.add("Sharukh");  //Runtime Exception (UnsupportedOperationException)

        actors.add("Sharukh");
        System.out.println(actors);  //[Ajay, Akshay, Sharukh]
        System.out.println(copyActors);  //[Ajay, Akshay]

        //New added API : Collectors.toUnmodifiableList
        List<String> copy = actors.stream().collect(Collectors.toUnmodifiableList());
        //copy.add("John");  //Runtime Exception (UnsupportedOperationException)

    }
}
