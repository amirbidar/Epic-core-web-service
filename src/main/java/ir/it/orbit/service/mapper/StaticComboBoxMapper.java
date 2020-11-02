package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.StaticComboboxDTO;
import ir.it.orbit.service.xml.WidgetJson.StaticCombobox;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface StaticComboBoxMapper extends EntityMapper<StaticComboboxDTO, StaticCombobox> {


}
