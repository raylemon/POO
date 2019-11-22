package be.ifosup.info.poo.hellofresh.pojo;

/**
 * Enum class, used for list categories
 */
public enum Category {
    MEAT("Viande"),
    POULTRY("Volaille"),
    FISH("Poisson"),
    VEGGIE("Végé");

    /**
     * Empty constructor
     *
     * @param cat Text
     */
    Category(String cat) {
    }
}
