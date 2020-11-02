package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.RadioEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.RadioEditableTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,ListenersMapper.class, BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class})
public interface RadioEditableTableMapper extends EntityMapper<RadioEditableTableDTO, RadioEditableTable> {


}
