import java.text.MessageFormat;

public class Logical {
    public static void main(String... args) {
        var i = 10;
        var j = 5;

        /** Assertion 1 */
        if (i < 5 && j++<10) System.out.println("&&1 true");
        else System.out.println("&&1 false");
        System.out.println(MessageFormat.format("i={0}, j={1}",i,j));

        /** Assertion 2 */
        if (i < 5 & j++ < 10) System.out.println("&2 true");
        else System.out.println("&2 false");
        System.out.println(MessageFormat.format("i={0}, j={1}",i,j));

        /** Assertion 3 */
        if (i<15 && j++<10) System.out.println("&&3 true");
        else System.out.println("&&3 false");
        System.out.println(MessageFormat.format("i={0}, j={1}",i,j));

        /** Assertion 4 */
        if (i<15 || j++<10) System.out.println("|| true");
        else System.out.println("|| false");
        System.out.println(MessageFormat.format("i={0}, j={1}",i,j));

    }
}
