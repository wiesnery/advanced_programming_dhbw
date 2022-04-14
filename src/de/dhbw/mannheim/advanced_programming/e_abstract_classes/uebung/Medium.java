package de.dhbw.mannheim.advanced_programming.e_abstract_classes.uebung;

public abstract class Medium {

    private final String author;
    private final String ISBN;
    private final String title;

    protected Medium(String author, String isbn, String title) {
        this.author = author;
        ISBN = isbn;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public abstract void produce();
}
