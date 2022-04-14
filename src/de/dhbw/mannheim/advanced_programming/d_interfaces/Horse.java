package de.dhbw.mannheim.advanced_programming.d_interfaces;

public class Horse implements Herbivore, DrinksMilk {

    @Override
    public void eatPlants() {
        System.out.println("The horse enjoys the gras!");
    }

    @Override
    public void drinkMilk() {
        System.out.println("The horse enjoys the milk!");
    }
}
