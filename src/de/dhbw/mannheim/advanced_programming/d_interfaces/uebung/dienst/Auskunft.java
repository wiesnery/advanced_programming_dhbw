package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.dienst;

public class Auskunft extends Dienst {

    private String thema;

    public Auskunft(double price, String thema) {
        super(price);
        this.thema = thema;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }
}
