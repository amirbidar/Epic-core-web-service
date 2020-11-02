package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.BaseValidationDTO;
import ir.it.orbit.service.xml.Base.BaseValidation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface BaseValidationMapper extends EntityMapper<BaseValidationDTO, BaseValidation> {


}
