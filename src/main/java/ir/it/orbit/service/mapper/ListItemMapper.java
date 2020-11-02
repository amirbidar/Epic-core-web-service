package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.ListItem.ListItemDTO;
import ir.it.orbit.service.xml.Attributes.ListItem.ListItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ConverterMapper.class})
public interface ListItemMapper extends EntityMapper<ListItemDTO, ListItem> {


}
