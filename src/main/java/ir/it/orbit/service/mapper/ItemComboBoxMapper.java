package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.StaticComboBox.ItemDTO;
import ir.it.orbit.service.xml.Attributes.StaticComboBox.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ItemComboBoxMapper extends EntityMapper<ItemDTO, Item> {


}
