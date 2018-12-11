package pojo;

import generatorRequest.HotelGenerator;

public class Hotel {
    private String name;
    private int floor;
    private int number;

    public Hotel(HotelGenerator hotelGenerator) {
    }

    public Hotel(String name, int floor, int number) {
        this.name = name;
        this.floor = floor;
        this.number = number;
    }

    public Hotel(String name) {

    }

    public Hotel() {
        
    }

    public Hotel(String name, String name1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberRoom() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", numberRoom=" + number +
                '}';
    }

}

