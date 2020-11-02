package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.EditableGridDTO;
import ir.it.orbit.service.xml.WidgetJson.EditableGrid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface EditableGridMapper extends EntityMapper<EditableGridDTO, EditableGrid> {


}
