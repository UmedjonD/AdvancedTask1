package producer;

import generatorRequest.HotelGenerator;
import pojo.Hotel;
import service.Queue;

public class Producer implements Runnable {
    private Queue queue;
    private Hotel hotel;
    private HotelGenerator hotelGenerator;

    public Producer(Queue queue){
        this.queue = queue;
    }

    public Producer() {
    }

    @Override
    public void run() {
//        while(!Thread.currentThread().isInterrupted()) {
//            hotel = hotelGenerator.generatoreRequest();
//            queue.add(hotel);
        for (int i = 0; i<500; i++){
            System.out.println("Ku Thread " + i);
        }
    }
}