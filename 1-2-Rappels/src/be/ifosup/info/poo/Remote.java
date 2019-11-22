package be.ifosup.info.poo;


public class Remote {
   private int width;
   private int height;
   private int depth;

   private Button[] buttons = new Button[5];
   private Diode diode;

   public Remote(){
       for (int i = 0; i < 5; i++) {
           buttons[i] = new Button(i,String.valueOf(i));
       }
   }

   public void changeChannel(Button button){
       int code  = button.pushButton();
       diode.sendCode(code);
   }

   public void turnOn(){

   }
}

class Button {
    private int code;
    private String label;

    public Button(int code, String label){
        this.code = code;
        this.label = label;
    }
    public int pushButton(){ return code ;}
}

class Diode {
    private String color;

    public void sendCode(int code){
        System.out.println("Emitting " + code);
    }
}
