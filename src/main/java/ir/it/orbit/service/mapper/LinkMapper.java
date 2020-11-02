package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import ir.it.orbit.service.dto.LinkDTO;
import ir.it.orbit.service.xml.WidgetJson.Link;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class, ListenersMapper.class, EventAllMapper.class})
public interface LinkMapper extends EntityMapper<LinkDTO, Link> {


}
