package service;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import pojo.Hotel;

import javax.swing.plaf.TableHeaderUI;

public class Queue {

    private Deque<Hotel> hotelQueue = new ArrayDeque<Hotel>();
    //private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Queue.class);
    private static final int maxRequest = 5;
    private static final int limitRequest = 15;
    private volatile int count;

    public synchronized void add(Hotel hotel){

        while (this.hotelQueue.size() == this.maxRequest) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(this.count > limitRequest){
                return;
            }else {
                System.out.println("Producer " + Thread.currentThread().getName() + " отправил заказ "
                        + count);
                hotelQueue.add(hotel);
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notifyAll();
            }
        }
    }

    public synchronized Hotel get(){
        while (hotelQueue.isEmpty()){
            if (this.count == limitRequest) {
                return null;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        Hotel hotel = hotelQueue.pollFirst();
        System.out.println("Consumer получил заказ " + hotel.toString() + "  " + this.hotelQueue.size() );

        notifyAll();
        return hotel;
    }
}
