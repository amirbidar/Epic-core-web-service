package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.StaticComboBox.ItemsComboBoxDTO;
import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.TransitionComboDTO;
import ir.it.orbit.service.xml.WidgetJson.TransitionCombo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class, ConverterMapper.class, GridLayoutDataMapper.class, ItemsComboBoxMapper.class, EventAllMapper.class})
public interface TransitionComboMapper extends EntityMapper<TransitionComboDTO, TransitionCombo> {


}
