package Week2.Day5.LibraryMmanagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Library {
    // HashMaps provide O(1) lookup time for validations
    private Map<String, Book> bookCatalog;
    private Map<String, Member> members;

    public Library() {
        this.bookCatalog = new HashMap<>();
        this.members = new HashMap<>();
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    // Validation 1: Prevent Duplicate ISBN
    public void addBook(Book book) {
        if (bookCatalog.containsKey(book.getIsbn())) {
            throw new DuplicateIsbnException("Book with ISBN " + book.getIsbn() + " already exists.");
        }
        bookCatalog.put(book.getIsbn(), book);
        System.out.println("✅ Added to catalog: " + book.getTitle());
    }

    // Live Feature: Issue Book
    public void issueBook(String isbn, String memberId) {
        // Validation 2: Missing Book
        Book book = bookCatalog.get(isbn);
        if (book == null) {
            throw new BookNotFoundException("Cannot issue: No book found with ISBN " + isbn);
        }

        // Validation 3: Unavailable Copy
        if (!book.isAvailable()) {
            throw new BookUnavailableException("Cannot issue: '" + book.getTitle() + "' is currently checked out.");
        }

        Member member = members.get(memberId);
        if (member == null) {
            throw new IllegalArgumentException("Member ID not found.");
        }

        // State changes
        book.setAvailable(false);
        member.borrowBook(book);
        System.out.println("📖 Issued '" + book.getTitle() + "' to " + member.getName());
    }

    // Live Feature: Return Book
    public void returnBook(String isbn, String memberId) {
        Book book = bookCatalog.get(isbn);
        if (book == null) {
            throw new BookNotFoundException("Cannot return: No book found with ISBN " + isbn);
        }

        Member member = members.get(memberId);
        if (member != null && member.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            member.returnBook(book);
            System.out.println("🔄 Returned '" + book.getTitle() + "' from " + member.getName());
        } else {
            System.out.println("❌ " + member.getName() + " does not have this book checked out.");
        }
    }
}