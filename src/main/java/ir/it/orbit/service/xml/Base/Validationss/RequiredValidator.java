package ir.it.orbit.service.xml.Base.Validationss;

import ir.it.orbit.service.xml.Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public
class RequiredValidator {
    @JsonProperty("run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
}
