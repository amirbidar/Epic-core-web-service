package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.RefFormsDTO;
import ir.it.orbit.service.xml.Base.RefForm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {RefFormMapper.class})
public interface RefFormsMapper extends EntityMapper<RefFormsDTO, RefForm> {



}
