package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.ListItem.ListItemsDTO;
import ir.it.orbit.service.xml.Attributes.ListItem.ListItems;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListItemMapper.class})
public interface ListItemsMapper extends EntityMapper<ListItemsDTO, ListItems> {


}
