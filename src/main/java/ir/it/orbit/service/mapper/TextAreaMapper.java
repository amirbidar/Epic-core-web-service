package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.TextareaDTO;
import ir.it.orbit.service.xml.WidgetJson.Textarea;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,BaseValidationMapper.class,ConverterMapper.class,LayoutDateMapper.class,EventAllMapper.class})
public interface TextAreaMapper extends EntityMapper<TextareaDTO, Textarea> {


}
