package java9Features.interfacePrivateMethods;

public class CustomClass implements CustomInterface {
    /*
    * Since java 9, you will be able to add private methods and private static method in interfaces.

    * These private methods will improve code re-usability inside interfaces.
    For example, if two default methods needed to share code, a private interface method
    would allow them to do so, but without exposing that private method to it’s implementing classes.

    * Using private methods in interfaces have four rules :
        -- Private interface method cannot be abstract.
        -- Private method can be used only inside interface.
        -- Private static method can be used inside other static and non-static interface methods.
        -- Private non-static methods cannot be used inside private static methods.
    * */

    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        CustomInterface instance = new CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }

}

//output :
/*
abstract method
private method
private static method
default method
private static method
static method
* */
