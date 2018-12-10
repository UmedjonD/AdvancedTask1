import producer.Producer;

public class Main {
    public static void main(String[] args) {

        Thread myThread = new Thread(new Producer());
        myThread.start();

        Thread myThread2 = new Thread(new Producer());
        myThread2.start();
        

    }
}
