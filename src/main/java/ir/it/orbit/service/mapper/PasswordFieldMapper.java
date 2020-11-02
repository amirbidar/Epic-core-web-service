package ir.it.orbit.service.mapper;


import ir.it.orbit.service.dto.Base.BaseValidationDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.PasswordFieldDTO;
import ir.it.orbit.service.xml.WidgetJson.PasswordField;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class, GridLayoutDataMapper.class, EventAllMapper.class})
public interface PasswordFieldMapper extends EntityMapper<PasswordFieldDTO, PasswordField> {


}
