package com.kuscuoglugizem;

/*
1. Kitap: Kitapların temel özelliklerini (ISBN, başlık, yazar, yayın yılı vb.) içerir ve diğer
kitap türleri için temel (base class) görevi görür.
 */
public abstract class Book {

    private String ISBN;
    private String title;
    private String author;
    private int publicationYear;
    private EStatus status;


    public Book(String ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.status = status;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", status=" + status +
                '}';
    }

    public void borrowBook() {
        this.status = EStatus.BORROWED;
    }
    public void returnBook(){
        this.status=EStatus.AVAILABLE;
    }

    public abstract String bookType();


}
