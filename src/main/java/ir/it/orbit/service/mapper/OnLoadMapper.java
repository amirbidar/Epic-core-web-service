package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnLoadDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnLoad;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnLoadMapper extends EntityMapper<OnLoadDTO, OnLoad> {



}
