package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.CheckBoxItemDTO;
import ir.it.orbit.service.xml.WidgetJson.CheckBoxItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface CheckBoxItemMapper extends EntityMapper<CheckBoxItemDTO, CheckBoxItem> {


}
