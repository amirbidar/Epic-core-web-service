package ir.it.orbit.service.dto.Base.Validationss;

import lombok.Data;

@Data
public class SelectionValidationDTO {
    public Integer maximumSelection;
    public String runAt;
    public Integer minimumSelection;
}
