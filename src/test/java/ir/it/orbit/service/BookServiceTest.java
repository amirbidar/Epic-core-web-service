package ir.it.orbit.service;

import ir.it.orbit.EpicApp;
import ir.it.orbit.domain.Book;
import ir.it.orbit.repository.BookRepository;
import ir.it.orbit.service.dto.BookDTO;
import ir.it.orbit.service.mapper.BookMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(classes = EpicApp.class)
public class BookServiceTest {

    private static final String DEFAULT_NAME = "AAAAAAAAAA";

    private static final String DEFAULT_AUTHOR = "AAAAAAAAAA";
    private static final BigDecimal DEFAULT_PRICE = new BigDecimal(1);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookService bookService;


    @Autowired
    private EntityManager em;


    private Book book;


    public static Book createEntity(EntityManager em) {
        Book book = new Book()
                .name(DEFAULT_NAME)
                .author(DEFAULT_AUTHOR)
                .price(DEFAULT_PRICE);
        return book;
    }


    @BeforeEach
    public void initTest() {
        book = createEntity(em);
    }

    @Test
    @Transactional
    public void createBook() {
        int databaseSizeBeforeCreate = bookRepository.findAll().size();

        // Create the Book
        BookDTO bookDTO = bookMapper.toDto(book);
        bookService.save(bookDTO);

        // Validate the Book in the database
        List<Book> bookList = bookRepository.findAll();
        assertThat(bookList).hasSize(databaseSizeBeforeCreate + 1);
        Book testBook = bookList.get(bookList.size() - 1);
        assertThat(testBook.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testBook.getAuthor()).isEqualTo(DEFAULT_AUTHOR);
        assertThat(testBook.getPrice()).isEqualTo(DEFAULT_PRICE);
    }
}
