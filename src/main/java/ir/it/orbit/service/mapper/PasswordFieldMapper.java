package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.PasswordFieldDTO;
import ir.it.orbit.service.xml.WidgetJson.PasswordField;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface PasswordFieldMapper extends EntityMapper<PasswordFieldDTO, PasswordField> {


}
