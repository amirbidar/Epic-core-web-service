package ir.it.orbit.service.xml.Base.Validationss;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SelectionValidation {
    @JsonProperty("maximum-selection")
    public Integer maximumSelection;
    @JsonProperty("run-at")
    public String runAt;
    @JsonProperty("minimum-selection")
    public Integer minimumSelection;
}
