package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.RadioGroupDTO;
import ir.it.orbit.service.xml.WidgetJson.RadioGroup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutMapper.class, GridLayoutDataMapper.class, ListenersMapper.class, BaseValidationMapper.class, ConverterMapper.class,RadioItemMapper.class, EventAllMapper.class})
public interface RadioGroupMapper extends EntityMapper<RadioGroupDTO, RadioGroup> {


}
