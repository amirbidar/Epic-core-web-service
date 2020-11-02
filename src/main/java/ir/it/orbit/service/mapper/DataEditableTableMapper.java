package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.DataEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.DataEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EntityEditableGridMapper.class})
public interface DataEditableTableMapper extends EntityMapper<DataEditableTableDTO, DataEditableTable> {


}
