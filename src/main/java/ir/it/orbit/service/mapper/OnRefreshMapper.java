package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnRefreshDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnRefresh;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnRefreshMapper extends EntityMapper<OnRefreshDTO, OnRefresh> {



}
