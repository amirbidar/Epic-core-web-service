package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.PropertyEditableGridDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.PropertyEditableGrid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ConverterMapper.class})
public interface PropertyEditableGridMapper extends EntityMapper<PropertyEditableGridDTO, PropertyEditableGrid> {


}
