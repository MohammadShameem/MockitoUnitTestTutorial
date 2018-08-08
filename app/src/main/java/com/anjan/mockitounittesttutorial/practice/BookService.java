package com.anjan.mockitounittesttutorial.practice;

public class BookService {


    public Book getBook(Book book){

        return book;
    }

    public Book tellBookNameForGettingBook(String bookId, String bookName, String bookAuthorName){

        return new Book(bookId,bookName,bookAuthorName);

    }





}
