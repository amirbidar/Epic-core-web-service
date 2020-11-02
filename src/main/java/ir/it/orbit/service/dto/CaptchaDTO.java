package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.BaseValidation;
import ir.it.orbit.service.dto.Base.LayoutData;
import lombok.Data;

@Data
public class CaptchaDTO {
    public LayoutData layoutData;
    public BaseValidation validators;
    public String name;
    public String label;
    public Boolean enabled;
}
