package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.EntityEditableGridDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.EntityEditableGrid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PropertyEditableGridMapper.class})
public interface EntityEditableGridMapper extends EntityMapper<EntityEditableGridDTO, EntityEditableGrid> {


}
