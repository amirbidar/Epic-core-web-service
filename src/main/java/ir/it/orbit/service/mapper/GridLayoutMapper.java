package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.CheckBoxGroupDTO;
import ir.it.orbit.service.xml.WidgetJson.CheckBoxGroup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface GridLayouMapper extends EntityMapper<CheckBoxGroupDTO, CheckBoxGroup> {


}
