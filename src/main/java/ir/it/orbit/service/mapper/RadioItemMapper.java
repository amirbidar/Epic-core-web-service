package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.RadioItemDTO;
import ir.it.orbit.service.xml.WidgetJson.RadioItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {GridLayoutDataMapper.class, ListenersMapper.class, BaseValidationMapper.class, ConverterMapper.class, EventAllMapper.class})
public interface RadioItemMapper extends EntityMapper<RadioItemDTO, RadioItem> {

}
