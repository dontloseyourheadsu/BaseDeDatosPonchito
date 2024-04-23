package models;

public class Stage {
    private String identifier;
    private int orderNumber;
    private String placeName;
    private String city;
    private String country;
    private int duration;

    public Stage(String identifier, int orderNumber, String placeName, String city, String country, int duration) {
        this.identifier = identifier;
        this.orderNumber = orderNumber;
        this.placeName = placeName;
        this.city = city;
        this.country = country;
        this.duration = duration;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
