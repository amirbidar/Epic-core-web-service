package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.Validationss.RequiredValidatorDTO;
import ir.it.orbit.service.xml.Base.Validationss.RequiredValidator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface RequiredValidatorMapper extends EntityMapper<RequiredValidatorDTO, RequiredValidator> {


}
