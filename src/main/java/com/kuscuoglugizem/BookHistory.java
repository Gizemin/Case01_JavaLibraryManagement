package com.kuscuoglugizem;

public class BookHistory extends Book {
    public BookHistory(String ISBN, String title, String author, int publicationYear) {
        super(ISBN, title, author, publicationYear);
    }

    @Override
    public String bookType() {
        return "History";
    }
}
