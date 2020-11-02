package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorDTO;
import ir.it.orbit.service.dto.Attributes.EditableTable.ColumnEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.ColumnEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CellEditorMapper.class})
public interface ColumnEditableTableMapper extends EntityMapper<ColumnEditableTableDTO, ColumnEditableTable> {


}
