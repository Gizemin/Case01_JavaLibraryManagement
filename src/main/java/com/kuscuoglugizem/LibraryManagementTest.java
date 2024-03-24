package com.kuscuoglugizem;

import java.util.ArrayList;

public class LibraryManagementTest {
    public static void main(String[] args) {



        Library library=new Library();

        BookHistory book1= new BookHistory("0000000001", "Nutuk", "Mustafa Kemal Atatürk",1881);
        BookScience book2=new BookScience( "0000000002","Kozmos: Evrenin ve Yaşamın Sırları", "Carl Sagan", 1234);
        BookNovel book3=new BookNovel("0000000003", "Martin Eden", "Jack London",1111);
        BookNovel book4=new BookNovel("0000000004","İklimler","Andre Maurois", 1112);
        BookNovel book5=new BookNovel("0000000005","Köpek Kalbi","Mihail Bulgakov",1115);
        BookNovel book6=new BookNovel("0000000006", "Dar Kapı", "Andre Gide",1116);
        BookScience book7= new BookScience("0000000007", "Zamanın Kısa Tarihi", "Stephen Hawking", 1117);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        library.ListOfBooks();


        Member member1=new Member("Gizem", new ArrayList<>());
        Member member2=new Member("Ada", new ArrayList<>());
        Member member3=new Member("Deniz", new ArrayList<>());

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        library.ListOfMembers();

        member1.borrowABook(book1);

        member1.viewBorrowedBooks();

        member2.returnABook(book3);

        library.deleteMember(member1);

        library.ListOfMembers();


    }
}