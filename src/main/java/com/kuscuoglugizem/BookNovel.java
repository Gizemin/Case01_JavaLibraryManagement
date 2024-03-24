package com.kuscuoglugizem;

public class BookNovel extends Book{
    public BookNovel(String ISBN, String title, String author, int publicationYear) {
        super(ISBN, title, author, publicationYear);
    }

    @Override
    public String bookType() {
        return "Novella!";
    }
}
