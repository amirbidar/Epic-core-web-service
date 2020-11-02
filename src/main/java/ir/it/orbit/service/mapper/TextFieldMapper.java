package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.TextFieldDTO;
import ir.it.orbit.service.xml.WidgetJson.TextField;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class, GridLayoutDataMapper.class, EventAllMapper.class, ConverterMapper.class})
public interface TextFieldMapper extends EntityMapper<TextFieldDTO, TextField> {


}
