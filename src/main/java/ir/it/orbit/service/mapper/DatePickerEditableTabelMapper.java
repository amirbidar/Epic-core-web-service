package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.DatePickerEditableTabelDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.DatePickerEditableTabel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class,ConverterMapper.class,EventAllMapper.class})
public interface DatePickerEditableTabelMapper extends EntityMapper<DatePickerEditableTabelDTO, DatePickerEditableTabel> {


}
