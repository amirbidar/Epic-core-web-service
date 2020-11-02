package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnSelectDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnChange;
import ir.it.orbit.service.xml.Base.EventListeners.OnSelect;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnChangeMapper extends EntityMapper<ir.it.orbit.service.dto.Base.EventListeners.OnChangeDTO, OnChange> {



}
