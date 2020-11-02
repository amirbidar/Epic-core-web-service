package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.TextFieldDTO;
import ir.it.orbit.service.xml.WidgetJson.TextField;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface TextFieldMapper extends EntityMapper<TextFieldDTO, TextField> {


}
