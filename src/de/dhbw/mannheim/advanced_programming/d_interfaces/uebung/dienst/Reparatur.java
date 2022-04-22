package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.dienst;

import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.MitBeschreibung;

public class Reparatur extends Dienst implements MitBeschreibung {

    private String[] werkzeuge;

    public Reparatur(double price, String[] werkzeuge) {
        super(price);
        this.werkzeuge = werkzeuge;
    }

    public String[] getWerkzeuge() {
        return werkzeuge;
    }

    public void setWerkzeuge(String[] werkzeuge) {
        this.werkzeuge = werkzeuge;
    }

    @Override
    public String getBeschreibung() {
        return "Preis: " + getPrice() + "€, 1. Werkzeug: " + werkzeuge[0];
    }
}
