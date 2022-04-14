package de.dhbw.mannheim.advanced_programming.e_abstract_classes.uebung;

public class CD extends Medium {
    protected CD(String author, String isbn, String title) {
        super(author, isbn, title);
    }

    @Override
    public void produce() {
        System.out.println();
    }

    public void play() {
        System.out.println("lalala");
    }
}
