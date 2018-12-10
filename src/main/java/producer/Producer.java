package producer;

import generatorRequest.HotelGenerator;
import pojo.Hotel;
import service.Queue;

public class Producer implements Runnable {
    private Queue queue;
    private Hotel hotel;
    private HotelGenerator hotelGenerator;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i<15; i++){
            queue.add(new Hotel(new HotelGenerator().generatoreRequest().getName(), Thread.currentThread().getName()));
            // System.out.println("Поток " + Thread.currentThread().getName() + " " + i);
        }
    }
}