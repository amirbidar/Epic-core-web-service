package ir.it.orbit.service.mapper;

import ir.it.orbit.domain.Book;
import ir.it.orbit.service.dto.Base.ArgumentDTO;
import ir.it.orbit.service.dto.BookDTO;
import ir.it.orbit.service.xml.Base.Argument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ArgumentMapper extends EntityMapper<ArgumentDTO, Argument> {

}
