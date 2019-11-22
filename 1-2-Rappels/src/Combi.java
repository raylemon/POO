/*
    Écrivez un programme qui affiche toutes les manières possibles d’obtenir 1€ avec des pièces de 2ct, 5 ct et 10 ct.
    Indiquez combien de possibilités ont été trouvées.
    Ex:
    1€ = 50 x 2ct
    1€ = 45 x 2ct + 2x 5ct
    …
    En tout, il y a 66 façons de faire 1€
 */
public class Combi {
    public static void main(String[] args) {
        var nbe = 0;
        int n2, n5, n10;
        for (n10 = 0; n10 <= 10; n10++)
            for (n5 = 0; n5 <= 20; n5++)
                for (n2 = 0; n2 <= 50; n2++) {
                    if (2 * n2 + 5 * n5 + 10 * n10 == 100) {
                        nbe++;
                        System.out.print("1€ = ");
                        if (n2 != 0) System.out.print(n2 + " x 2ct");
                        if (n5 != 0) {
                            if (n2 != 0) System.out.print(" + ");
                            System.out.print(n5 + " x 5ct");
                        }
                        if (n10 != 0) {
                            if ((n2 != 0) || (n5 != 0)) System.out.print(" + ");
                            System.out.print(n10 + " x 10ct");
                        }
                        System.out.println();
                    }
                }
        System.out.println("En tout, il y a " +nbe+" possibilités de faire 1€");
    }
}

