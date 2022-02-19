package de.dhbw.mannheim.advanced_programming.b_enums;

public class Enumeration_Sample {

    public static void main(String[] args) {
        System.out.printf("The week has %d days.", DaysOfWeek.values().length);

        // TODO: use values to print examples
        for (int i = 0; i < DaysOfWeek.values().length; i++) {
            System.out.println(DaysOfWeek.values()[i]);
        }

        System.out.println();

        // TODO: use enhanced for loop
        for (var day : DaysOfWeekWithNames.values()) {
            System.out.println(day.getNameOfDay());
        }
    }

}
