package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnNextDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnNext;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnNextMapper extends EntityMapper<OnNextDTO, OnNext> {



}
