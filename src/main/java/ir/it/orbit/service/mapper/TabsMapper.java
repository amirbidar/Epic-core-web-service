package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.TabFolder.TabsDTO;
import ir.it.orbit.service.xml.Attributes.TabFolder.Tabs;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TabMapper.class})
public interface TabsMapper extends EntityMapper<TabsDTO, Tabs> {


}
