package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.Validationss.DateRangeValidatorDTO;
import ir.it.orbit.service.dto.Base.Validationss.NumberValidatorDTO;
import ir.it.orbit.service.dto.Base.Validationss.StringValidatorDTO;
import ir.it.orbit.service.xml.Base.Validationss.DateRangeValidator;
import ir.it.orbit.service.xml.Base.Validationss.NumberValidator;
import ir.it.orbit.service.xml.Base.Validationss.StringValidator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface DateRangeValidatorMapper extends EntityMapper<DateRangeValidatorDTO, DateRangeValidator> {


}
