package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnSearchDTO;
import ir.it.orbit.service.dto.Base.EventListeners.OnSelectionChangeDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnSearch;
import ir.it.orbit.service.xml.Base.EventListeners.OnSelectionChange;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnSelectionChangeMapper extends EntityMapper<OnSelectionChangeDTO, OnSelectionChange> {

}
