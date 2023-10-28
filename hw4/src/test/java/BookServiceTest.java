import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.mockito.*;
import ru.gbhw.*;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        bookService = new BookService(bookRepository);
    }
    
    @Test
    public void testGetBookById(){
        Book book = new Book("1");
        when(bookRepository.findById("1")).thenReturn(book);

        Book result = bookService.findBookById("1");
        assertEquals(book, result);

        verify(bookRepository, times(1)).findById("1");
    }
}
