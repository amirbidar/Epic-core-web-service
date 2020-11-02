package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.xml.Base.EventAll;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OnLoadMapper.class})
public interface EventAllMapper extends EntityMapper<EventAllDTO, EventAll> {


}
