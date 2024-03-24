package com.kuscuoglugizem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getMemberName() + " became a member of the library.");
    }

    public void deleteBook (Book book) {
        if(books.contains(book)){
            books.remove(book);
            System.out.println(book.getTitle() + " deleted from library.");
        }else{
            System.out.println(book.getTitle() + " not found in library.");
        }
    }


    public void deleteMember (Member member) {
        if(members.contains(member)){
            members.remove(member);
            System.out.println(member.getMemberName() + " membership deleted from the library.");
        }else{
            System.out.println(member.getMemberName() + " member not found.");
        }
    }
    public void ListOfBooks() {
        System.out.println("Books in the library: ");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (" + book.bookType() + ") " );
        }
    }

    public void ListOfMembers() {
        System.out.println("Members in the Library: ");
        for (Member member: members) {
            System.out.println("- " + member.getMemberName());
        }

    }

}
