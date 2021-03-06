package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.TabFolderDTO;
import ir.it.orbit.service.xml.WidgetJson.TabFolder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,ListenersMapper.class,EventAllMapper.class, TabsMapper.class})
public interface TabFolderMapper extends EntityMapper<TabFolderDTO, TabFolder> {


}
