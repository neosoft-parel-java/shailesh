package java8Features;

public class ExactArithmetic {
    public static void main(String[] args) {
        System.out.println("------------------exact operations--------------------");
        //Normal multiplication
        System.out.println( 100000 * 100000 );          //1410065408 -> incorrect result

        //Using multiPlyExact
        //System.out.println( Math.multiplyExact( 100000 , 100000 ));         //Exception in thread "main" java.lang.ArithmeticException: integer overflow

        //Normal add operation
        System.out.println( Integer.MAX_VALUE + Integer.MAX_VALUE );        //-2 -> incorrect result

        //Using addExact
        //System.out.println( Math.addExact( Integer.MAX_VALUE , Integer.MAX_VALUE ));        //exception

        System.out.println("------------------floorMod--------------------");
        System.out.println( 10 % 2 );   //0
        System.out.println( 11 % 2 );   //1
        System.out.println( -15 % 2 );  //-1
        System.out.println( -16 % 2 );  //0

        System.out.println( Math.floorMod(10 , 2) );    //0
        System.out.println( Math.floorMod(11 , 2) );    //1
        System.out.println( Math.floorMod(-15 , 2) );   //1
        System.out.println( Math.floorMod(-16 , 2) );   //0

        System.out.println("------------------floorDiv--------------------");
        System.out.println( (10+3) % 12 );  //1
        System.out.println( (5+6) % 12 );   //11
        System.out.println( (10-27) % 12 ); //-5

        System.out.println( Math.floorMod(10+3 , 12) );     //1
        System.out.println( Math.floorMod(5+6 , 12) );      //11
        System.out.println( Math.floorMod(10-27 , 12) );    //7

        System.out.println("------------------toIntExact--------------------");
        System.out.println( Math.toIntExact(10_00_00_000) );    //100000000
        System.out.println( Math.toIntExact(Long.MAX_VALUE) );  //Exception
    }
}
