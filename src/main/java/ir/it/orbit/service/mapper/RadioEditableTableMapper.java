package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.RadioEditableTableDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.RadioEditableTable;
import ir.it.orbit.service.xml.Base.BaseValidation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,ListenersMapper.class, BaseValidation.class,ConverterMapper.class,EventAllMapper.class})
public interface RadioEditableTableMapper extends EntityMapper<RadioEditableTableDTO, RadioEditableTable> {


}
