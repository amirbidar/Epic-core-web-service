package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnPreviousDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnPrevious;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnPreviousMapper extends EntityMapper<OnPreviousDTO, OnPrevious> {



}
