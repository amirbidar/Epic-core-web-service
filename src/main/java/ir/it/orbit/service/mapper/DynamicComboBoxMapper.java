package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.DynamicComboBoxDTO;
import ir.it.orbit.service.xml.WidgetJson.DynamicComboBox;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class, ConverterMapper.class,LayoutDateMapper.class,ItemsComboBoxMapper.class,EventAllMapper.class})
public interface DynamicComboBoxMapper extends EntityMapper<DynamicComboBoxDTO, DynamicComboBox> {


}
