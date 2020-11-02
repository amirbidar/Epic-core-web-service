package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.BaseValidationDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import lombok.Data;

@Data
public class CaptchaDTO {
    public LayoutDataDTO layoutData;
    public BaseValidationDTO validators;
    public String name;
    public String label;
    public Boolean enabled;
}
