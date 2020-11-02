package ir.it.orbit.service.mapper;

import ir.it.orbit.domain.Book;
import ir.it.orbit.service.dto.BookDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface BookMapper extends EntityMapper<BookDTO, Book> {


    default Book fromId(Long id) {
        if (id == null) {
            return null;
        }
        Book book = new Book();
        book.setId(id);
        return book;
    }
}
