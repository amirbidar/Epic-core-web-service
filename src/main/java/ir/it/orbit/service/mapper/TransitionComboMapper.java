package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.TransitionComboDTO;
import ir.it.orbit.service.xml.WidgetJson.TransitionCombo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface TransitionComboMapper extends EntityMapper<TransitionComboDTO, TransitionCombo> {


}
