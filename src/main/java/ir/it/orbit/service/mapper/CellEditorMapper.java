package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.ColumnEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.ColumnEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TextFieldEditableTabeMapper.class,TextAreaEditableTabelMapper.class,PasswordFieldEditableTabelMapper.class,DatePickerEditableTabelMapper.class,DropDownEditableTableMapper.class,CheckBoxGroupEditableTablMapper.class,CheckBoxEditableTableMapper.class,RadioEditableTableMapper.class})
public interface CellEditorMapper extends EntityMapper<ColumnEditableTableDTO, ColumnEditableTable> {


}
