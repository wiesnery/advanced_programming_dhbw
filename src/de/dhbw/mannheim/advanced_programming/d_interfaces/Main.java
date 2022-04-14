package de.dhbw.mannheim.advanced_programming.d_interfaces;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.muh();
        Horse horse = new Horse();

        Herbivore[] herbivores = {cow, horse};
        DrinksMilk[] drinksMilk = {cow, horse};

        for (int i = 0; herbivores.length < i; i++) {
            herbivores[i].eatPlants();
        }

        for (int i = 0; drinksMilk.length < i; i++) {
            drinksMilk[i].drinkMilk();
        }
    }
}
