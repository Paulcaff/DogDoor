public class BrDriver {
    public static void main(String[] args) {

        BarkRecogniser br = new BarkRecogniser();
        br.recognise("bang");

        try{
            Thread.currentThread().sleep(10000);
        }
        catch(InterruptedException e){}

        br.recognise("woof");





    }
}
