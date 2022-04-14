package de.dhbw.mannheim.advanced_programming.c_exceptions.uebung;

import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        int glueck = 0;
        int pech = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                testMyLuck();
                glueck++;
            } catch (BadLuckException e) {
                System.out.println("Pech gehabt :(");
                pech++;
            }
        }

        System.out.println("Glück: " + glueck + " Pech: " + pech + " Verhältnis: " + pech / ((double)glueck + pech));
    }

    static void testMyLuck() throws BadLuckException {

        int luckValue = random.nextInt(9);

        if (luckValue <= 1) {
            // Pech gehabt
            throw new BadLuckException();
        }

    }

    public static class BadLuckException extends Exception {

    }
}


/*
- Schreibe eine Methode „void testMyLuck()“, die per Zufall mit einer Wahrscheinlichkeit von 20% eine BadLuckException wirft.
 Da es sehr wahrscheinlich ist, dass die Exception auftritt, sollte die Art der Exception gut gewählt sein.
 Rufe die Methode in einer Schleife 100 Mal auf und zähle, wie viel Glück und wie viel Pech wir haben und gib es in der Konsole aus.

 */