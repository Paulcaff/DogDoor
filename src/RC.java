import java.util.Timer;
import java.util.TimerTask;

public class RC {
    private Door d1;

    public RC(){
        this.d1 = new Door();
    }
    public void pressBtn(){
        System.out.println("pressing button....");

        if(this.d1.isOpen()){
            d1.close();
        }

        else{
            d1.open();

        }
    }
}
