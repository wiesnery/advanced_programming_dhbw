package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.produkt;

import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.MitBeschreibung;

public class Buch extends Produkt implements MitBeschreibung {

    private final String autor;

    public Buch(long produktnummer, String name, String autor) {
        super(produktnummer, name);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getBeschreibung() {
        return getName() + " von " + getAutor();
    }
}
