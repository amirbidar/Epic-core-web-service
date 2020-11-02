package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.TextFieldEditableTabelDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.TextFieldEditableTabel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class})
public interface TextFieldEditableTabeMapper extends EntityMapper<TextFieldEditableTabelDTO, TextFieldEditableTabel> {


}
