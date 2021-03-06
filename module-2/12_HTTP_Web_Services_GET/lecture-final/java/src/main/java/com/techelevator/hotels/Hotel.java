package com.techelevator.hotels;

public class Hotel {

    private int id;
    private String name;
    private int stars;
    private int roomsAvailable;
    private String coverImage;
    private double costPerNight;
    private Address address;

    public Hotel() {}


    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Hotel Details" +
                "\n--------------------------------------------" +
                "\n Id: " + id +
                "\n Name:'" + name + '\'' +
                "\n Stars: " + stars +
                "\n RoomsAvailable: " + roomsAvailable +
                "\n overImage" + coverImage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public String getCoverImage() {
        return coverImage;
    }
    
    public double getCostPerNight() {
    	return costPerNight;
    }
    
    public Address getAddress() {
    	return address;
    }
}
