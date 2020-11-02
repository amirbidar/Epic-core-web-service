package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.PhaseListenerDTO;
import ir.it.orbit.service.xml.Base.PhaseListener;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface PhaseListenerMapper extends EntityMapper<PhaseListenerDTO, PhaseListener> {


}
