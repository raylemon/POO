import java.util.Scanner;

/*
    Écrivez un programme qui dessine un sapin formé d’étoiles. La hauteur du sapin sera lue au clavier. On s’arrangera
    pour que la dernière ligne du sapin s’affiche sur le bord gauche de l’écran.
    Ex:                     *
                           ***
                          *****
                         *******
 */
public class Tree {
    /* public static void main(String[] args) {
        var space = " ";
        var star = "*";
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var nbis =n;
        for (int i = 0; i <  n; i++) {
            for (int j = 0; j < nbis; j++) {
                space += " ";
            }
            System.out.println(space +star);
            star += "**" ;
            space = " ";
            nbis--;
        }
    }*/
    public static void main(String[] args) {
        final var character = '*';
        var scanner = new Scanner(System.in);
        System.out.print("Nombre de lignes ?: ");
        var nblines = scanner.nextInt();

        for (int cptLines = 0; cptLines < nblines; cptLines++) {
            var nbSpaces = nblines - cptLines - 1;
            for (int i = 0; i < nbSpaces; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i < 2 * cptLines + 1; i++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
