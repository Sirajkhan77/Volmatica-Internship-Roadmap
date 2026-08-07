import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.SpringSiraj.Book;
import com.SpringSiraj.BookRepository;
import com.SpringSiraj.BookService;
import com.SpringSiraj.LibraryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LibraryServiceTest {


//
//    @Mock
//    LibraryService bs;
//
//    @Mock
//    BookRepository br;
//
//    @Test
//    @DisplayName("Should get the book from the database")
//    void gettingBook(){
//        Book b1= new Book(1, "Java khan");
//        when(br.findById(1))
//                .thenReturn(b1);
//
//        assertEquals("Java Kkhan", bs.findBook(1).getName());
//    }
//
//
//
//




















    @Mock
    private BookRepository repository;

    @InjectMocks
    private LibraryService service;

    @Test
    void shouldFindBookSuccessfully() {

        Book book = new Book(1, "Java");

        when(repository.findById(1))
                .thenReturn(book);

        assertEquals("Java", service.findBook(1).getName());

    }

}