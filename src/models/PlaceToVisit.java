package models;

public class PlaceToVisit {
    private String name;
    private String city;
    private String country;
    private String address;
    private String description;
    private int price;

    public PlaceToVisit() {}

    public PlaceToVisit(String name, String city, String country, String address, String description, int price) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.address = address;
        this.description = description;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
