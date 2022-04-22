package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.dienst;

public abstract class Dienst {
    private double price;

    public Dienst(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
