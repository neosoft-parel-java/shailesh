package java9Features;

public class CompactString {

    /*
    * Till Java 8, String in java were internally represented by char[].
    * Each char is stored in 2 bytes in memory. JDK developers at oracle analyzed
    * lots of client’s application heap dumps and they noticed that most of the strings can be represented
    * only using Latin-1 characters set. A latin-1 char can be stored in one byte, which is 50% (1 byte)
    * less than char data type storage.

    * So, the JDK developers defaulted the String classes internal storage to byte[] from char[].
    * This has resulted in saving of lots of space in heap memory because string objects
    * take up really big portion of heap memory, generally. [Source]

    * You can control the usage of this feature in your application using
    * -XX:-CompactStrings parameters to java command.
    */

    //Before Java 9 ========================>
    /*
    * public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {

    //The value is used for character storage.
    private final char value[];

    }
    * */

    //After Java 9 =========================>
    /*
    * public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {

    The value is used for character storage.
    @Stable
    private final byte[] value;

     * The identifier of the encoding used to encode the bytes in
     * {@code value}. The supported values in this implementation are
     *
     * LATIN1
     * UTF16
     *
     * @implNote This field is trusted by the VM, and is a subject to
     * constant folding if String instance is constant. Overwriting this
     * field after construction will cause problems.
     *

     private final byte coder;

}*/
}
