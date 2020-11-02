package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.DynamicWidgetDTO;
import ir.it.orbit.service.xml.WidgetJson.DynamicWidget;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface DynamicWidgetMapper extends EntityMapper<DynamicWidgetDTO, DynamicWidget> {


}
