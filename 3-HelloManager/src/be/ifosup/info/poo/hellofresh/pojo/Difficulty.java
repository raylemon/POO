package be.ifosup.info.poo.hellofresh.pojo;

/**
 * Difficulty
 */
public enum Difficulty {
    VERY_SIMPLE("Très facile"),
    SIMPLE("Facile"),
    HARD("Difficile"),
    VERY_HARD("Beaucoup d'opérations"),
    TRICKY("Défi culinaire");

    /**
     * Empty constructor
     *
     * @param difficulty String
     */
    Difficulty(String difficulty) {
    }
}
