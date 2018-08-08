package com.anjan.mockitounittesttutorial.practice;

public class Product {
    private BookService bookService;

    public Product(BookService bookService){
        this.bookService= bookService;
    }
    private int sum=0,sub=0;
    private int a=5,b=6;

    public int sum(int a , int b){
        sum =a +b;
        return sum;
    }


    public void sub(){
        sub= a-b;
    }


    public Book libraryBookBook(String bookId, String bookName, String bookAuthorName){
        Book book=bookService.tellBookNameForGettingBook(bookId,bookName,bookAuthorName);
        return bookService.getBook(book);
    }












}
