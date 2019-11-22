package be.ifosup.info.poo;

public class Voiture {
    private String color;
    private String brand;
    private boolean automatic;
    private long chassis;
    private String model;
    private Motor motor;

    public Voiture(long chassis) {
        this.chassis = chassis;
    }

    public static void main(String[] args) {
        var nissan = new Voiture(1L); //JAVA 10
        // Voiture nissan = new Voiture(1L) //Java 8
        nissan.setBrand("Nissan");
        System.out.println(nissan);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getChassis() {
        return chassis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand.toUpperCase() + " " + model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    public void start(){
        getMotor().start();
    }

    @Override
    public String toString() {
        return getBrand() + " " + getChassis();
    }
}
