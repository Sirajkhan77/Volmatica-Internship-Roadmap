package Week2.Day5.LibraryMmanagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private boolean isAvailable;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = true; // Available by default when added
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return title + " (ISBN: " + isbn + ")";
    }
}

