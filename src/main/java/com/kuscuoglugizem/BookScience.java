package com.kuscuoglugizem;

public class BookScience extends Book{
    public BookScience(String ISBN, String title, String author, int publicationYear) {
        super(ISBN, title, author, publicationYear);
    }

    @Override
    public String bookType() {
        return "Science";
    }
}
