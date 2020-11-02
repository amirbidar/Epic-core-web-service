package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnDoubleClickDTO;
import ir.it.orbit.service.dto.Base.EventListeners.OnRowActionDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnDoubleClick;
import ir.it.orbit.service.xml.Base.EventListeners.OnRowAction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnRowActionMapper extends EntityMapper<OnRowActionDTO, OnRowAction> {

}
