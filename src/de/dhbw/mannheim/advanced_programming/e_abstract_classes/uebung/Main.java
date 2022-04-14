package de.dhbw.mannheim.advanced_programming.e_abstract_classes.uebung;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Medium[] library = new Medium[5];

        library[0] = new Buch("Steven Hawkins", "4711", "The universe in a nutshell...");
        library[1] = new Buch("Steven Hawkins", "4712", "The universe in a nutshell...");
        library[2] = new CD("Adele", "2121", "21");
        library[3] = new CD("Adele", "2122", "22");
        library[4] = new Buch("Steven Hawkins", "4712", "The universe in a nutshell...");

        int countCDs = countAndPlayCDs(library);

        System.out.println("Wir haben " + countCDs + " CDs");
    }

    public static int countAndPlayCDs(Medium[] media) {
        int numberCDs = 0;
        for (int i = 0; i < media.length; i++) {
            if (media[i] instanceof CD) {
                numberCDs++;
                CD cd = (CD) media[i];
                playCD(cd);
            }
        }

        return numberCDs;
    }

    public static void playCD(CD cd) {
        cd.play();
    }

}
