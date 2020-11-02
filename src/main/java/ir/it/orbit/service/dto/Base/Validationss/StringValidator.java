package ir.it.orbit.service.dto.Base.Validationss;

import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public
class StringValidator {
    private EnumsDecleration.NumberValidatorEnvironment environment;
    private String regularExpression;
    private String errorMessageRegularExpression;
    private String minimumLength;
    private String maximumLength;

}
