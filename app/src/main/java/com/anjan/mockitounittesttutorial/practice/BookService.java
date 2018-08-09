package com.anjan.mockitounittesttutorial.practice;

public class BookService {


    public Book getBook(Book book){

        return new Book(book.getBookId(),book.getBookName(),book.getBookAutorName());
    }

    public Book tellBookNameForGettingBook(String bookId, String bookName, String bookAuthorName){

        return new Book(bookId,bookName,bookAuthorName);

    }





}
