package ir.it.orbit.service.dto.Base.Validationss;

import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public
class EmailValidatorDTO {
    private EnumsDecleration.NumberValidatorEnvironment environment;
}
