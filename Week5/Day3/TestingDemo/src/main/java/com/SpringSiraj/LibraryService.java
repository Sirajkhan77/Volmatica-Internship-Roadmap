package com.SpringSiraj;

public class LibraryService {

    private BookRepository repository;

    public LibraryService(BookRepository repository) {
        this.repository = repository;
    }

    public Book findBook(int id) {
        return repository.findById(id);
    }

    public void addBook(Book book) {
        repository.save(book);
    }
}
