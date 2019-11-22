/* Écrivez un programme calculant la somme des *n* premiers termes de la série harmonique 1+1/2+1/3+…+1/n. La valeur n
 * sera lue au clavier.
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class Serie {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int number;
        var sum = 0f;

        do {
            System.out.print("Combien de termes ?: ");
            number = scanner.nextInt();
        }
        while (number<1);
        for (int i = number; i>0; i--){
            sum += 1f/i;
            System.out.print(sum +" ");
        }
        System.out.println(MessageFormat.format("Somme des {0} premiers termes = {1}", number,sum));
    }
}