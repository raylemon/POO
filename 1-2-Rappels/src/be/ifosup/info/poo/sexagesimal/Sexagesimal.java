package be.ifosup.info.poo.sexagesimal;

public class Sexagesimal {
    //private double decimalHour;
    private int hour;
    private int minutes;
    private int seconds;

    public Sexagesimal(double decimalHours) {
        //this.decimalHour = decimalHours;
        this.hour = (int)decimalHours;
        double decmin = (decimalHours-hour)*60;
        this.minutes = (int) decmin;
        this.seconds = (int) ((decmin-minutes)*60);
    }

    public Sexagesimal(int hours, int minutes, int seconds) {
        //this.decimalHour = hours + (double)minutes/60 + (double)seconds/3600;
        this.hour = hours;
        this.minutes = minutes;
        this.seconds =seconds;
    }

    public int getHours() {
        //return (int)decimalHour;
        return hour;
    }

    public int getMinutes() {
        //return (int) ((decimalHour-getHours())*60);
        return minutes;
    }

    public int getSeconds() {
        //double minutesDecimal = (decimalHour-getHours())*60;
        //return (int) ((minutesDecimal-getMinutes())*60);
        return seconds;
    }

    public double getDecimalHour() {
        //return decimalHour;
        return hour+ (double)minutes/60 + (double)seconds/3600;
    }
}
