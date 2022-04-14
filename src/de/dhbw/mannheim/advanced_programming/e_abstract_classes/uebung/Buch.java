package de.dhbw.mannheim.advanced_programming.e_abstract_classes.uebung;

public class Buch extends Medium{
    protected Buch(String author, String isbn, String title) {
        super(author, isbn, title);
    }

    @Override
    public void produce() {
        System.out.println("produce a book");
    }
}
