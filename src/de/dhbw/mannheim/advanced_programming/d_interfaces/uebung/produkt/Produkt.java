package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.produkt;

public abstract class Produkt {
    private final long produktnummer;
    private String name;

    public Produkt(long produktnummer, String name) {
        this.produktnummer = produktnummer;
        this.name = name;
    }

    public long getProduktnummer() {
        return produktnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
