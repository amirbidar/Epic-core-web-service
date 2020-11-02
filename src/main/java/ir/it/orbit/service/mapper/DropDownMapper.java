package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.DropDownDTO;
import ir.it.orbit.service.xml.WidgetJson.DropDown;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,BaseValidationMapper.class,ConverterMapper.class,LayoutDateMapper.class,EventAllMapper.class,ItemsComboBoxMapper.class})
public interface DropDownMapper extends EntityMapper<DropDownDTO, DropDown> {


}
