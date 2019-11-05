import java.util.Timer;
import java.util.TimerTask;

public class BarkRecogniser {

    private Door door;

    public BarkRecogniser(){
        this.door = new Door();
    }
    public void recognise(String bark){

        if(bark.equals("woof")) {
            door.open();
        }

        }
    }

