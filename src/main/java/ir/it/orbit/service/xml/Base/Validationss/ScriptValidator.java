package ir.it.orbit.service.xml.Base.Validationss;

import ir.it.orbit.service.xml.Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public
class ScriptValidator {
    @JsonProperty("run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
    @JsonProperty( "client-side-language")
    private EnumsDecleration.Language language;
    private EnumsDecleration.EventPhase phase;
    @JsonProperty("error-message")
    private String errorMessage;
    private String script;
}
