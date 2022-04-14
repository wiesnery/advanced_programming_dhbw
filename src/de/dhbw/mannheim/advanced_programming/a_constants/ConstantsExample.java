package de.dhbw.mannheim.advanced_programming.a_constants;

public class ConstantsExample {

    /* Declaration:
            [<visibility modifier>] [static] final <type> <name> = <initial value>;
         */
    // TODO: how do you call this kind of naming?
    public final int DAYS_PER_WEEK = 7;

    private void print_days_of_week() {
        System.out.printf("The week has %d days.", this.DAYS_PER_WEEK);
    }



    public static void main(String[] args) {
        var example = new ConstantsExample();
        example.print_days_of_week();

        example.constants_are_not_assignable_during_runtime();

        example.is_the_holiday_gonna_be_fun(40);
    }

    private void constants_are_not_assignable_during_runtime () {
        // uncomment to see it breaking
        // this.DAYS_PER_WEEK = 5;
    }

    /* TODO: refactor me
        - extract constants
        - simplify if else
     */
    private boolean is_the_holiday_gonna_be_fun(float degree_celsius) {

        var kelvin = degree_celsius + 273.15;

        if (kelvin > 300.15) {
            return true;
        } else
            return false;


    }
}
