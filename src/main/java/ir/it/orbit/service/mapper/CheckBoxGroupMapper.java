package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.dto.CheckBoxGroupDTO;
import ir.it.orbit.service.xml.WidgetJson.CheckBoxGroup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutMapper.class,LayoutDateMapper.class,BaseValidationMapper.class,ConverterMapper.class,ListenersMapper.class,EventAllMapper.class})
public interface CheckBoxGroupMapper extends EntityMapper<CheckBoxGroupDTO, CheckBoxGroup> {


}
