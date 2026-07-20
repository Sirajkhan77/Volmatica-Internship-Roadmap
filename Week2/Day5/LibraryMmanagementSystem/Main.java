package Week2.Day5.LibraryMmanagementSystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.registerMember(new Member("M01", "Alice"));

        // Test 1: Add a book successfully
        library.addBook(new Book("123-4", "System Design Interview"));

        // Test 2: Trigger DuplicateIsbnException
        try {
            library.addBook(new Book("123-4", "Another Copy"));
        } catch (DuplicateIsbnException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test 3: Issue a book successfully
        library.issueBook("123-4", "M01");

        // Test 4: Trigger BookUnavailableException
        try {
            library.issueBook("123-4", "M01");
        } catch (BookUnavailableException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test 5: Trigger BookNotFoundException
        try {
            library.issueBook("999-9", "M01");
        } catch (BookNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test 6: Return the book
        library.returnBook("123-4", "M01");
    }
}