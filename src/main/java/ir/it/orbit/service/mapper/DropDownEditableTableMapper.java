package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.DropDownEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.DropDownEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class})
public interface DropDownEditableTableMapper extends EntityMapper<DropDownEditableTableDTO, DropDownEditableTable> {


}
