package com.SpringSiraj;

import com.SpringSiraj.library.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the MAVEN project... ");
        Book book = new Book("Master Spring Boot");
        book.display();
    }
}