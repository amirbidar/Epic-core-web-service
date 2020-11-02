package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.RadioGroupDTO;
import ir.it.orbit.service.xml.WidgetJson.RadioGroup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface RadioGroupMapper extends EntityMapper<RadioGroupDTO, RadioGroup> {


}
