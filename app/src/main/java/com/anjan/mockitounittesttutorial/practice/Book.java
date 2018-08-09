package com.anjan.mockitounittesttutorial.practice;

public class Book {
    String bookId;
    String bookName;
    String bookAutorName;

    public Book(String bookId, String bookName, String bookAutorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAutorName = bookAutorName;
    }


    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAutorName() {
        return bookAutorName;
    }
}
