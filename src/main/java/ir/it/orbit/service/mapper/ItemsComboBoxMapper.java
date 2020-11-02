package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.StaticComboBox.ItemsComboBoxDTO;
import ir.it.orbit.service.xml.Attributes.StaticComboBox.ItemsComboBox;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ItemComboBoxMapper.class})
public interface ItemsComboBoxMapper extends EntityMapper<ItemsComboBoxDTO, ItemsComboBox> {


}
