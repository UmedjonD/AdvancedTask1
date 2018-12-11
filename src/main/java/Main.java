import consumer.Consumer;
import producer.Producer;
import service.Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        for(int i=0; i<3; i++){
            Producer producer = new Producer(queue);
            Thread myThread = new Thread(producer);
            myThread.start();
        }
//        for (int i = 0; i < 6; i++) {
//            Consumer consumer = new Consumer();
//            Thread myThread = new Thread(consumer);
//            myThread.start();
//        }
    }
}
