import com.SpringSiraj.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BookServiceTest {
    private BookService b;
    @BeforeEach
    void setup(){
        b= new BookService();
    }

    @Test
    void issueIfAv(){
        assertEquals("Issued", b.issueBook(true));
    }

    @Test
    void issueIfNotAv(){
        assertThrows(
                IllegalStateException.class,
                ()->b.issueBook(false)
        );
    }


    @Test
    void returnBook(){
        assertEquals("Returned", b.returnBook());
    }
}
