package Week5.Day3;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Book {
    String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}

class BookService {
    public Book issueBook(Book book) {
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already issued");
        }
        book.setAvailable(false);
        return book;
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
    }

    public Book findBook(String title, Book[] catalog) {
        for (Book b : catalog) {
            if (b.title.equals(title)) return b;
        }
        return null;
    }
}

class BookServiceTest {
    private BookService bookService;
    private Book myBook;

    @BeforeEach
    void setUp() {
        // Runs before every single test to ensure a fresh state
        bookService = new BookService();
        myBook = new Book("Clean Code");
    }

    // TEST 1: Happy Path
    @Test
    @DisplayName("Should successfully issue an available book")
    void shouldIssueBookSuccessfully() {
        // Arrange (Setup is handled in @BeforeEach)

        // Act
        Book issuedBook = bookService.issueBook(myBook);

        // Assert
        assertNotNull(issuedBook, "Issued book should not be null");
        assertFalse(issuedBook.isAvailable(), "Book status should be updated to unavailable");
    }

    // TEST 2: Failure Path
    @Test
    @DisplayName("Should throw exception when issuing an unavailable book")
    void shouldThrowExceptionWhenIssuingUnavailableBook() {
        // Arrange
        myBook.setAvailable(false);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> {
            bookService.issueBook(myBook);
        }, "Should throw exception if book is already taken");
    }

    // TEST 3: Happy Path
    @Test
    @DisplayName("Should successfully return a book")
    void shouldReturnBookSuccessfully() {
        // Arrange
        myBook.setAvailable(false);

        // Act
        bookService.returnBook(myBook);

        // Assert
        assertTrue(myBook.isAvailable(), "Returned book should be available");
    }

    // TEST 4: AssertNotNull Usage
    @Test
    @DisplayName("Should find an existing book in the catalog")
    void shouldFindExistingBook() {
        // Arrange
        Book[] catalog = { new Book("Design Patterns"), myBook };

        // Act
        Book foundBook = bookService.findBook("Clean Code", catalog);

        // Assert
        assertNotNull(foundBook);
    }

    // TEST 5: AssertNull Usage
    @Test
    @DisplayName("Should return null if book does not exist in catalog")
    void shouldReturnNullForMissingBook() {
        // Arrange
        Book[] catalog = { new Book("Design Patterns") };

        // Act
        Book foundBook = bookService.findBook("Clean Code", catalog);

        // Assert
        assertNull(foundBook, "Should return null when book is missing");
    }
}