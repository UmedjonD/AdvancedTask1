import producer.Producer;

public class Main {
    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            Thread myThread = new Thread(new Producer());
            myThread.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
