package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.ColumnsEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.ColumnsEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ColumnEditableTableMapper.class})
public interface ColumnsEditableTableMapper extends EntityMapper<ColumnsEditableTableDTO, ColumnsEditableTable> {


}
