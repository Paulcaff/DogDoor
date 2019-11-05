import java.util.Timer;
import java.util.TimerTask;

public class Door {
    private boolean open;

    public Door(){
        this.open = false;
    }

    public void open(){
        System.out.println("The door is opening");
        this.open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 500);
    }

    public void close(){
        System.out.println("The door is closing");
        this.open = false;
    }

    public boolean isOpen(){
        return this.open;
    }
}
