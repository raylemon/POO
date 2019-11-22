package be.ifosup.info.poo.sexagesimal;

public class MainApp {
    public static void main(String[] args) {
        var hour1 = new Sexagesimal(3.5);
        System.out.println(hour1.getHours() + ":"+ hour1.getMinutes() + ":" +hour1.getSeconds() );

        var hour2 = new Sexagesimal(4,35,18);
        System.out.println(hour2.getDecimalHour());
        System.out.println(hour2.getHours()+":"+hour2.getMinutes()+":"+hour2.getSeconds());
    }
}
