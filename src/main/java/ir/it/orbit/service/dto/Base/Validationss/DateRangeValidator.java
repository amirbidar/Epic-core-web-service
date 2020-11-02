package ir.it.orbit.service.dto.Base.Validationss;

import lombok.Data;

@Data
public class DateRangeValidator {
    public Integer maximumValue;
    public Integer minimumValue;
    public String runAt;

}
