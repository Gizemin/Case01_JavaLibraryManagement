package com.kuscuoglugizem;

import java.util.ArrayList;
import java.util.List;

public class Member implements IMember {

    private String memberName;
    private List<Book> borrowedBooks;


    public Member(String memberName, List<Book> borrowedBooks){
        this.memberName=memberName;
        this.borrowedBooks=borrowedBooks;
    }


    @Override
    public void borrowABook(Book book) {
        if (book.getStatus()==EStatus.AVAILABLE){
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println("The book named '"+ book.getTitle() + "' was borrowed.");
        } else{
            System.out.println("The book named '"+ book.getTitle() + "' is currently on loan or not available.");
        }
    }


    // bak
    @Override
    public void returnABook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println("The book named '"+ book.getTitle() + "' was returned.");
        } else {
            System.out.println("You don't already have the book called '"+ book.getTitle() + "'");
        }

    }

    @Override
    public void viewBorrowedBooks() {

        if(borrowedBooks.isEmpty()){
            System.out.println("You don't currently have any books borrowed.");
        }else{
            System.out.println("List of books you've borrowed: ");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
