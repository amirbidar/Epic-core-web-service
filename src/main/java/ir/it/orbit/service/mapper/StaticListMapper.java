package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.StaticListDTO;
import ir.it.orbit.service.xml.WidgetJson.StaticList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface StaticListMapper extends EntityMapper<StaticListDTO, StaticList> {


}
