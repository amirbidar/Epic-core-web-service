package ir.it.orbit.web.rest;

import ir.it.orbit.service.BookService;
import ir.it.orbit.service.dto.BookDTO;
import ir.it.orbit.web.rest.errors.BadRequestAlertException;
import ir.it.orbit.web.rest.util.HeaderUtil;
import ir.it.orbit.web.rest.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookResource {

    private final Logger log = LoggerFactory.getLogger(BookResource.class);

    private static final String ENTITY_NAME = "epicBook";

    @Value("${epic.clientApp.name}")
    private String applicationName;

    private final BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) throws URISyntaxException {
        log.debug("REST request to save Book : {}", bookDTO);
        if (bookDTO.getId() != null) {
            throw new BadRequestAlertException("A new book cannot already have an ID", ENTITY_NAME, "idexists");
        }
        BookDTO result = bookService.save(bookDTO);
        return ResponseEntity.created(new URI("/api/books/" + result.getId()))
                .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
                .body(result);
    }

    @PutMapping("/books")
    public ResponseEntity<BookDTO> updateBook(@RequestBody BookDTO bookDTO) throws URISyntaxException {
        log.debug("REST request to update Book : {}", bookDTO);
        if (bookDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        BookDTO result = bookService.save(bookDTO);
        return ResponseEntity.ok()
                .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, bookDTO.getId().toString()))
                .body(result);
    }

    @GetMapping("/books")
    public List<BookDTO> getAllBooks() {
        log.debug("REST request to get all Books");
        return bookService.findAll();
    }


    @GetMapping("/books/{id}")
    public ResponseEntity<BookDTO> getBook(@PathVariable Long id) {
        log.debug("REST request to get Book : {}", id);
        Optional<BookDTO> bookDTO = bookService.findOne(id);
        return ResponseUtil.wrapOrNotFound(bookDTO);
    }


    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        log.debug("REST request to delete Book : {}", id);
        bookService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }


}
