package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.CheckBoxEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.CheckBoxEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class})
public interface CheckBoxEditableTableMapper extends EntityMapper<CheckBoxEditableTableDTO, CheckBoxEditableTable> {


}
