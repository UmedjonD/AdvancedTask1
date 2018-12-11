package producer;

import generatorRequest.HotelGenerator;
import pojo.Hotel;
import service.Queue;

public class Producer implements Runnable {
    private Queue queue;
    private Hotel hotel;
    private HotelGenerator hotelGenerator;
    private final int count = 15;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i<count; i++){
            queue.add(new HotelGenerator().generatoreRequest());
        }
    }
}