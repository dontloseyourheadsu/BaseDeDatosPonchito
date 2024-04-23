package models;

public class Hotel {
    private String name;
    private String city;
    private String country;
    private String address;
    private int numRooms;
    private int roomPrice;
    private int breakfastPrice;

    public Hotel(String name, String city, String country, String address, int numRooms, int roomPrice, int breakfastPrice) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.address = address;
        this.numRooms = numRooms;
        this.roomPrice = roomPrice;
        this.breakfastPrice = breakfastPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getBreakfastPrice() {
        return breakfastPrice;
    }

    public void setBreakfastPrice(int breakfastPrice) {
        this.breakfastPrice = breakfastPrice;
    }
}
