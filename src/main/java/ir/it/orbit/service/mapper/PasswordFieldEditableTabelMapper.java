package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.PasswordFieldEditableTabelDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.PasswordFieldEditableTabel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BaseValidationMapper.class,EventAllMapper.class})
public interface PasswordFieldEditableTabelMapper extends EntityMapper<PasswordFieldEditableTabelDTO, PasswordFieldEditableTabel> {


}
