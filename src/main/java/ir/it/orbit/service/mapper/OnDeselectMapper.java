package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnDeselectDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnDeselect;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnDeselectMapper extends EntityMapper<OnDeselectDTO, OnDeselect> {



}
