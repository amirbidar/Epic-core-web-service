package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.Validationss.CaptchaValidatorDTO;
import ir.it.orbit.service.dto.Base.Validationss.SelectionValidationDTO;
import ir.it.orbit.service.xml.Base.Validationss.CaptchaValidator;
import ir.it.orbit.service.xml.Base.Validationss.SelectionValidation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface SelectionValidationMapper extends EntityMapper<SelectionValidationDTO, SelectionValidation> {


}
