package ir.it.orbit.service;

import ir.it.orbit.domain.Book;
import ir.it.orbit.repository.BookRepository;
import ir.it.orbit.service.dto.BookDTO;
import ir.it.orbit.service.mapper.BookMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookService {

    private final Logger log = LoggerFactory.getLogger(BookService.class);

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;


    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }


    public BookDTO save(BookDTO bookDTO) {
        log.debug("Request to save Book : {}", bookDTO);
        Book book = bookMapper.toEntity(bookDTO);
        book = bookRepository.save(book);
        BookDTO result = bookMapper.toDto(book);
        return result;
    }


    @Transactional(readOnly = true)
    public List<BookDTO> findAll() {
        log.debug("Request to get all Books");
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toCollection(LinkedList::new));
    }


    @Transactional(readOnly = true)
    public Optional<BookDTO> findOne(Long id) {
        log.debug("Request to get Book : {}", id);
        return bookRepository.findById(id)
                .map(bookMapper::toDto);
    }

    public void delete(Long id) {
        log.debug("Request to delete Book : {}", id);
        bookRepository.deleteById(id);
    }

}

