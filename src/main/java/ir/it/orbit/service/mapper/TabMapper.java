package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.dto.Attributes.TabFolder.TabDTO;
import ir.it.orbit.service.xml.Attributes.TabFolder.Tab;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutMapper.class,ListenersMapper.class,EventAllMapper.class})
public interface TabMapper extends EntityMapper<TabDTO, Tab> {


}
