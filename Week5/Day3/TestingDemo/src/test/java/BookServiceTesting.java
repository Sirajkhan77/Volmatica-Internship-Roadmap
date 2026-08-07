import com.SpringSiraj.LibraryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.print.Book;

@ExtendWith(MockitoExtension.class)
public class BookServiceTesting {

    @Mock
    Book b2;

    @BeforeEach
    void setup(){
        b2 = new Book();
    }

    @InjectMocks
    LibraryService l1;
}
