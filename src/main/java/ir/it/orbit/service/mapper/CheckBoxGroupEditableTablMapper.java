package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.CheckBoxGroupEditableTableDTO;
import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.CheckBoxGroupEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutMapper.class,ListenersMapper.class,BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class})
public interface CheckBoxGroupEditableTablMapper extends EntityMapper<CheckBoxGroupEditableTableDTO, CheckBoxGroupEditableTable> {


}
