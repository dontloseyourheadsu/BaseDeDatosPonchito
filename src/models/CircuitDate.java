package models;

import java.util.Date;

public class CircuitDate {
    private String identifier;
    private Date departureDate;
    private int nbPersons;

    public CircuitDate(String identifier, Date departureDate, int nbPersons) {
        this.identifier = identifier;
        this.departureDate = departureDate;
        this.nbPersons = nbPersons;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getNbPersons() {
        return nbPersons;
    }

    public void setNbPersons(int nbPersons) {
        this.nbPersons = nbPersons;
    }
}
