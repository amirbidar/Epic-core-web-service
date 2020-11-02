package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnPreviousDTO;
import ir.it.orbit.service.dto.Base.EventListeners.OnSearchDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnPrevious;
import ir.it.orbit.service.xml.Base.EventListeners.OnSearch;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnSearchMapper extends EntityMapper<OnSearchDTO, OnSearch> {



}
