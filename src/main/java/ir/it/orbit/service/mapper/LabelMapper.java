package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.LabelDTO;
import ir.it.orbit.service.xml.WidgetJson.Label;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface LabelMapper extends EntityMapper<LabelDTO, Label> {


}
