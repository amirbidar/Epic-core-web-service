package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.RefFormDTO;
import ir.it.orbit.service.xml.Base.RefForm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface RefFormMapper extends EntityMapper<RefFormDTO, RefForm> {


}
