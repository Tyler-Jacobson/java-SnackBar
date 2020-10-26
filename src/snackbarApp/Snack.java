package snackbarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int newId) {
        this.vendingMachineId = newId;
    }

    // Special Methods
    public void addQuantity(int amountToAdd) {
        this.quantity += amountToAdd;
    }

    // public void buySnack(int amountToBuy) {
    //     this.quantity -= amountToBuy;
    // }

    public double buySnack(double amountToBuy) {
        this.quantity -= (int)amountToBuy;
        return amountToBuy * cost;
    }

    public double seeCost(double incomingQuantity) {
        return incomingQuantity * cost;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" +
        "name: " + name + "\n" +
        "quantity: " + quantity + "\n" +
        "cost: " + cost + "\n" +
        "vendingMachineId: " + vendingMachineId;
        return rtnStr;
    }
}
