package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventListeners.OnDoubleClickDTO;
import ir.it.orbit.service.xml.Base.EventListeners.OnDoubleClick;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArgumentMapper.class})
public interface OnDoubleClickMapper extends EntityMapper<OnDoubleClickDTO, OnDoubleClick> {

}
