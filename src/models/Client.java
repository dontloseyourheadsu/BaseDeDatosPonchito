package models;

public class Client {
    private int id;
    private String name;
    private String type;
    private int registrationYear;
    private boolean specialDiscount;

    public Client(int id, String name, String type, int registrationYear, boolean specialDiscount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.registrationYear = registrationYear;
        this.specialDiscount = specialDiscount;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getRegistrationYear() { return registrationYear; }
    public void setRegistrationYear(int registrationYear) { this.registrationYear = registrationYear; }

    public boolean getSpecialDiscount() { return specialDiscount; }
    public void setSpecialDiscount(boolean specialDiscount) { this.specialDiscount = specialDiscount; }
}
