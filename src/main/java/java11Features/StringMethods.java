package java11Features;

public class StringMethods {
    public static void main(String[] args) {

        String s = "   Shailesh      ";

        System.out.println("------------isBlank()------------");
        System.out.println(" ".isBlank()); //true
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true

        System.out.println("-------------without strip--------------");
        System.out.println("start"+s+"end");
        System.out.println("-------------strip-----------------");
        System.out.println("start"+s.strip()+"end");
        System.out.println("----------------stripLeading--------------");
        System.out.println("start"+s.stripLeading()+"end");
        System.out.println("----------------stripTrailing--------------");
        System.out.println("start"+s.stripTrailing()+"end");

        System.out.println("---------------repeat------------------");
        System.out.println(s.repeat(2));
    }
}
