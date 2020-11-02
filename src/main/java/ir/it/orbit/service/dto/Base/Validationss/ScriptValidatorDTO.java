package ir.it.orbit.service.dto.Base.Validationss;

import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public
class ScriptValidatorDTO {
    private EnumsDecleration.NumberValidatorEnvironment environment;
    private EnumsDecleration.Language language;
    private EnumsDecleration.EventPhase phase;
    private String errorMessage;
    private String script;
}
