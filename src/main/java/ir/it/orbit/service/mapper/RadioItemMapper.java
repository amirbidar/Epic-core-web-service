package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.RadioItemDTO;
import ir.it.orbit.service.xml.WidgetJson.RadioItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface RadioItemMapper extends EntityMapper<RadioItemDTO, RadioItem> {


}
