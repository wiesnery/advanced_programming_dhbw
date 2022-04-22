package de.dhbw.mannheim.advanced_programming.d_interfaces.uebung;

import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.dienst.Auskunft;
import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.dienst.Dienst;
import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.dienst.Reparatur;
import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.produkt.Buch;
import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.produkt.Produkt;
import de.dhbw.mannheim.advanced_programming.d_interfaces.uebung.produkt.Socke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List<Produkt> produkte = new ArrayList<>();
        produkte.add((Produkt) new Socke(55L, "Socke XL", 47)); // Upcast optional
        Produkt socke = new Socke(42L, "Socke S", 37);
        produkte.add(socke);
        Buch buch = new Buch(22L, "Buch - Herr der Ringe", "Tolkien");
        produkte.add(buch);
        produkte.add(new Buch(21L, "Buch - Harry Potter", "J. K. Rowling"));

        System.out.print("buch ist buch: ");
        System.out.println(buch instanceof Buch);

        System.out.print("buch ist Produkt: ");
        System.out.println(buch instanceof Produkt);

        System.out.print("buch ist Socke: ");
        System.out.println((Object) buch instanceof Socke);

        System.out.print("buch ist MitBeschreibung: ");
        System.out.println(buch instanceof MitBeschreibung);
        System.out.println();


        for (int i = 0; i < produkte.size(); i++) {
            Produkt produkt = produkte.get(i);
            System.out.println(produkt.getProduktnummer());
            // Die nächste Zeile funktioniert nicht, weil Produkt die Methode "getBeschreibung" nicht hat
            // produkt.getBeschreibung();
            if (produkt instanceof MitBeschreibung) {
                MitBeschreibung beschrieben = (MitBeschreibung) produkt;

                System.out.println(beschrieben.getBeschreibung());

                // Die nächste Zeile funktioniert nicht, weil MitBeschreibung die Methode "getProduktnummer" nicht hat
                // beschrieben.getProduktnummer();
            }
        }

        List<Dienst> dienste = new ArrayList<Dienst>();
        dienste.add(new Reparatur(44.3, new String[]{"Hammer", "Amboss"}));
        dienste.add(new Reparatur(49.2, new String[]{"Schraubenschluessel"}));
        dienste.add(new Auskunft(2, "Konzerte in Berlin"));
        dienste.add(new Auskunft(7, "Blumenladen in Hamburg"));

        for (int i = 0; i < dienste.size(); i++) {
            if (dienste.get(i) instanceof MitBeschreibung) {
                System.out.println(((MitBeschreibung) dienste.get(i)).getBeschreibung());
            }
        }

        List<MitBeschreibung> mitBeschreibungen = new ArrayList<>();
        mitBeschreibungen.add(new Buch(22L, "Buch - Herr der Ringe", "Tolkien"));
        // Das funktioniert nicht, weil Auskunft nicht das Interface MitBeschreibung implementiert
        // mitBeschreibungen.add(new Auskunft(2, "Konzerte in Berlin"));
        mitBeschreibungen.add(new Reparatur(49.2, new String[]{"Schraubenschluessel"}));

        for (int i = 0; i < mitBeschreibungen.size(); i++) {
            MitBeschreibung beschrieben = mitBeschreibungen.get(i);
            System.out.println(beschrieben.getBeschreibung());

            if (beschrieben instanceof Produkt) {
                Produkt produkt = (Produkt) beschrieben;
                System.out.println(produkt.getProduktnummer());
                // Das funktioniert nicht, nicht jedes Produkt ist ein Buch, daher ist die Methode getAutor() nicht verfügbar
                // System.out.println(produkt.getAutor());
            }

            if (beschrieben instanceof Buch) {
                Buch beschriebenesBuch = (Buch) beschrieben;

                System.out.println(beschriebenesBuch.getAutor());

                // Das funktioniert, denn jedes Buch ist ein Produkt, daher ist die Methode getProduktnummer() auch in Subklassen verfügbar
                System.out.println(beschriebenesBuch.getProduktnummer());
            }
        }


        Produkt onlyProdukt = (Produkt) new Socke(42L, "Socke S", 37);
        onlyProdukt.getProduktnummer();
        System.out.println(onlyProdukt instanceof Socke);
        // Das funktioniert nicht, weil wir oben einen impliziten Upcast von Socke zu Produkt haben und die Variable onlyProdukt vom Typ Produkt ist
        // Nichtsdestotrotz ist das objekt eine Socke...
        //onlyProdukt.getGroesse();


        printAll(new ArrayList<String>(List.of(new String[]{"abc", "def"})));

    }


    // Besser nur List<String> verwenden anstatt von LinkedList<String>, wenn die Implementierungsdetails egal sind
    public static void printAll(List<String> items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
