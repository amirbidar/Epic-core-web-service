package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.CheckBoxItemDTO;
import ir.it.orbit.service.xml.WidgetJson.CheckBoxItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,ListenersMapper.class,BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class,ItemCheckBoxGroupMapper.class})
public interface CheckBoxItemMapper extends EntityMapper<CheckBoxItemDTO, CheckBoxItem> {


}
