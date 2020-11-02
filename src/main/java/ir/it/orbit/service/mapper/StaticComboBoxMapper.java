package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.StaticComboboxDTO;
import ir.it.orbit.service.xml.WidgetJson.StaticCombobox;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class,ConverterMapper.class,LayoutDateMapper.class,EventAllMapper.class})
public interface StaticComboBoxMapper extends EntityMapper<StaticComboboxDTO, StaticCombobox> {


}
