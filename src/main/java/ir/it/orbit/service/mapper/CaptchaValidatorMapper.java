package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.Validationss.CaptchaValidatorDTO;
import ir.it.orbit.service.dto.Base.Validationss.ScriptValidatorDTO;
import ir.it.orbit.service.xml.Base.Validationss.CaptchaValidator;
import ir.it.orbit.service.xml.Base.Validationss.ScriptValidator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface CaptchaValidatorMapper extends EntityMapper<CaptchaValidatorDTO, CaptchaValidator> {


}
