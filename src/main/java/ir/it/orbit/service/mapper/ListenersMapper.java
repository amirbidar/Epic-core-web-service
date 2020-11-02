package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.ListenersDTO;
import ir.it.orbit.service.xml.Base.Listeners;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PhaseListenerMapper.class})
public interface ListenersMapper extends EntityMapper<ListenersDTO, Listeners> {


}
