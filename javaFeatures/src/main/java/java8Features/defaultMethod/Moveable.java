package java8Features.defaultMethod;

public interface Moveable {
    default void move(){
        System.out.println("Moving");
    }
}
