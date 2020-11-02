package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.Validationss.EmailValidatorDTO;
import ir.it.orbit.service.dto.Base.Validationss.RequiredValidatorDTO;
import ir.it.orbit.service.xml.Base.Validationss.EmailValidator;
import ir.it.orbit.service.xml.Base.Validationss.RequiredValidator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface EmailValidatorMapper extends EntityMapper<EmailValidatorDTO, EmailValidator> {


}
