package models;

public class Circuit {
    private String identifier;
    private String description;
    private String departureCity;
    private String departureCountry;
    private String arrivalCity;
    private String arrivalCountry;
    private int duration;
    private int price;

    public Circuit() {}

    public Circuit(String identifier, String description, String departureCity, String departureCountry, String arrivalCity, String arrivalCountry, int duration, int price) {
        this.identifier = identifier;
        this.description = description;
        this.departureCity = departureCity;
        this.departureCountry = departureCountry;
        this.arrivalCity = arrivalCity;
        this.arrivalCountry = arrivalCountry;
        this.duration = duration;
        this.price = price;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureCountry() {
        return departureCountry;
    }

    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getArrivalCountry() {
        return arrivalCountry;
    }

    public void setArrivalCountry(String arrivalCountry) {
        this.arrivalCountry = arrivalCountry;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
