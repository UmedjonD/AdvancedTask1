package generatorRequest;

import pojo.Hotel;
import java.util.Random;

public class HotelGenerator {

    public Hotel generatoreRequest(){
        Hotel hotel = new Hotel();
        Random random = new Random();

        String[] hotelName = {"Omar Hayyam", "Hayyat Regency", "Fifty Fifty", "By Joni", "NY City"};
        hotel.setName(hotelName[random.nextInt(hotelName.length)]);
        hotel.setFloor((random.nextInt(5)+1));
        hotel.setNumber((random.nextInt(500)+1));
        return hotel;
    }
}