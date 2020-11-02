package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.DatePickerDTO;
import ir.it.orbit.service.xml.WidgetJson.DatePicker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,EventAllMapper.class,BaseValidationMapper.class, ConverterMapper.class,LayoutDateMapper.class})
public interface DatePickerMapper extends EntityMapper<DatePickerDTO, DatePicker> {


}
