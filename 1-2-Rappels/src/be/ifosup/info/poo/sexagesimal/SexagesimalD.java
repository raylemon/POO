package be.ifosup.info.poo.sexagesimal;

public class SexagesimalD {
    private double decimalHour;

    public SexagesimalD(double hour) {
        this.decimalHour = hour;
    }

    public SexagesimalD(int hours, int minutes, int seconds) {
        this.decimalHour = hours + (double)minutes/60 + (double)seconds/3600;
    }

    public int getHours() {
        return (int)decimalHour;
    }

    public int getMinutes() {
        return (int) (60*(decimalHour-getHours()));
    }

    public int getSeconds() {
        var decimalMinutes = 60*(decimalHour-getHours());
        return (int) (60* (decimalMinutes-getMinutes()));
    }

    public double getDecimalHour() {
        return decimalHour;
    }

    public void setDecimalHour(double decimalHour) {
        this.decimalHour = decimalHour;
    }
}
