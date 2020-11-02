package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.ArgumentDTO;
import ir.it.orbit.service.dto.Base.EventListeners.OnFocusLostDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnFocusLost;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnFocusLostMapper extends EntityMapper<OnFocusLostDTO, OnFocusLost> {



}
