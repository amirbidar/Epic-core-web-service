package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.CheckBoxGroup.ItemCheckBoxGroupDTO;
import ir.it.orbit.service.xml.Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CheckBoxItemMapper.class})
public interface ItemCheckBoxGroupMapper extends EntityMapper<ItemCheckBoxGroupDTO, ItemCheckBoxGroup> {


}
