package de.dhbw.mannheim.advanced_programming.d_interfaces;

public class Cow implements Herbivore, DrinksMilk {
    @Override
    public void eatPlants() {
        System.out.println("The cow enjoys the gras 7 times...");
    }

    public void muh() {
        System.out.println("Muhh!!!");
    }

    @Override
    public void drinkMilk() {
        System.out.println("The cow drinks milk.");
    }
}
