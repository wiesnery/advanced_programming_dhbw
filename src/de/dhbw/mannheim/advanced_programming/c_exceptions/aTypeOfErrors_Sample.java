package de.dhbw.mannheim.advanced_programming.c_exceptions;

public class aTypeOfErrors_Sample {

    // 1. Compile-Time Errors

    // uncomment next two line to see the compilation fail :(
    // private void zugnummer = "ICE 530";
    // Long fahrtdauer = 55L

    public static void main(String[] args) {

        // 2. Logikfehler

        String[] rooms = {"D001", "B221", "C301"};

        for (int i = 1;  i< rooms.length; i++) {
            System.out.printf("%d. Room: %s", i,  rooms[i]);
            System.out.println();
        }
        // Why is it only two rooms??

        // 2. Laufzeitfehler
        var calculationResult =  55 / 0;

        System.out.println("This statement will never be reached");
    }
}
