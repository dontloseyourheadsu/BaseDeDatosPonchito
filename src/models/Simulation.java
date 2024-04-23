package models;

import java.util.Date;

public class Simulation {
    private int id;
    private int clientId;
    private Date startDate;
    private Date endDate;
    private int numberOfPeople;
    private double totalCost;
    private String status;

    public Simulation(int id, int clientId, Date startDate, Date endDate, int numberOfPeople, double totalCost, String status) {
        this.id = id;
        this.clientId = clientId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfPeople = numberOfPeople;
        this.totalCost = totalCost;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public int getNumberOfPeople() { return numberOfPeople; }
    public void setNumberOfPeople(int numberOfPeople) { this.numberOfPeople = numberOfPeople; }

    public double getTotalCost() { return totalCost; }
    public void setTotalCost(double totalCost) { this.totalCost = totalCost; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
