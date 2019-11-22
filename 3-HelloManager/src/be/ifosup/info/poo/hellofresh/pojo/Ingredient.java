package be.ifosup.info.poo.hellofresh.pojo;

public class Ingredient {
    private String name;
    private float quantity;
    private Unit unit;

    public Ingredient(String name, float quantity, Unit unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Ingredient(){ }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Unit {
        pc,
        g,
        ml
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " " + unit.toString() + ")" ;
    }

}
