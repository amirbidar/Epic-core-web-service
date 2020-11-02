package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.DynamicCheckboxDTO;
import ir.it.orbit.service.xml.WidgetJson.DynamicCheckbox;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,BaseValidationMapper.class,ConverterMapper.class,LayoutDateMapper.class,EventAllMapper.class})
public interface DynamicCheckBoxMapper extends EntityMapper<DynamicCheckboxDTO, DynamicCheckbox> {


}
