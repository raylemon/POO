import java.util.Scanner;

/** try with 0, 1, 4, 10, -5 */
public class Switch {
    public static void main(String... args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        var n = scanner.nextInt();
        switch (n){
            case 0:
                System.out.println("Null");
            case 1:
            case 2:
                System.out.println("Small"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Middle");
            default:
                System.out.println("Huge");
        }
    }
}
