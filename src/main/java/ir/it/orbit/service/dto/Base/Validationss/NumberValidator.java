package ir.it.orbit.service.dto.Base.Validationss;

import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public
class NumberValidator {
    private EnumsDecleration.NumberValidatorEnvironment environment;
    private Integer minimumValue;
    private Integer maximumValue;
    private Boolean includeMinimumBoundry;
    private Boolean includeMaximumBoundry;
    private Boolean integer;
}
