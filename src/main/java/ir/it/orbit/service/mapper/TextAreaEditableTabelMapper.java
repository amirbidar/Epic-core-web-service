package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.TextAreaEditableTabelDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.TextAreaEditableTabel;
import ir.it.orbit.service.xml.Base.EventAll;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BaseValidationMapper.class,ConverterMapper.class, EventAllMapper.class})
public interface TextAreaEditableTabelMapper extends EntityMapper<TextAreaEditableTabelDTO, TextAreaEditableTabel> {


}
