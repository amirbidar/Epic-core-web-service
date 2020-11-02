package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.LinkDTO;
import ir.it.orbit.service.xml.WidgetJson.Link;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface LinkMapper extends EntityMapper<LinkDTO, Link> {


}
