package com.anjan.mockitounittesttutorial.practice;

public class Book {
    String BookId;
    String bookName;
    String bookAutorName;

    public Book(String bookId, String bookName, String bookAutorName) {
        BookId = bookId;
        this.bookName = bookName;
        this.bookAutorName = bookAutorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId='" + BookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAutorName='" + bookAutorName + '\'' +
                '}';
    }
}
