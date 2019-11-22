package be.ifosup.info.poo;

public class Motor {
    private String carburant;
    private int power;
    private int cylinders;

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        power = power;
    }

    void start(){
        System.out.println("Vroum");
    }
}
