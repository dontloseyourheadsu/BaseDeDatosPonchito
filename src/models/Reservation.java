package models;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private int simulationId;
    private int clientId;
    private LocalDate reservationDate;
    private double finalCost;

    public Reservation(int id, int simulationId, int clientId, LocalDate reservationDate, double finalCost) {
        this.id = id;
        this.simulationId = simulationId;
        this.clientId = clientId;
        this.reservationDate = reservationDate;
        this.finalCost = finalCost;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getSimulationId() { return simulationId; }
    public void setSimulationId(int simulationId) { this.simulationId = simulationId; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public LocalDate getReservationDate() { return reservationDate; }
    public void setReservationDate(LocalDate reservationDate) { this.reservationDate = reservationDate; }

    public double getFinalCost() { return finalCost; }
    public void setFinalCost(double finalCost) { this.finalCost = finalCost; }
}
