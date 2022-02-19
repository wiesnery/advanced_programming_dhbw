package de.dhbw.mannheim.advanced_programming.b_enums;

public enum DaysOfWeekWithNames {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String nameOfDay;

    DaysOfWeekWithNames(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }
}
