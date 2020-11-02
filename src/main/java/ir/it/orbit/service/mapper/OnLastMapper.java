package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnEditDTO;
import ir.it.orbit.service.dto.Base.EventListeners.OnLastDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnEdit;
import ir.it.orbit.service.xml.Base.EventListeners.OnLast;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnLastMapper extends EntityMapper<OnLastDTO, OnLast> {
    
}
