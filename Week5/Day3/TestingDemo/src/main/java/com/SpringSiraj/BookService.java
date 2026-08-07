package com.SpringSiraj;

public class BookService {
    public  String issueBook(boolean av){
        if (!av){
            throw new IllegalStateException("book not available");
        }
        return  "Issued";
    }
    public  String returnBook(){
        return "Returned";
    }
}
