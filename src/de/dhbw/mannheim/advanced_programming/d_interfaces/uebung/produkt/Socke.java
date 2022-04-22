package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.produkt;

public class Socke extends Produkt {

    private final int groesse;

    public Socke(long produktnummer, String name, int groesse) {
        super(produktnummer, name);
        this.groesse = groesse;
    }

    public int getGroesse() {
        return groesse;
    }
}
