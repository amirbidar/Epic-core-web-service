package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.DatePickerDTO;
import ir.it.orbit.service.xml.WidgetJson.DatePicker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface DatePickerMapper extends EntityMapper<DatePickerDTO, DatePicker> {


}
