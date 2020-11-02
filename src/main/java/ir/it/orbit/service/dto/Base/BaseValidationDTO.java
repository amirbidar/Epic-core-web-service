package ir.it.orbit.service.dto.Base;

import ir.it.orbit.service.dto.Base.Validationss.*;
import lombok.Data;

import java.util.List;

@Data

public class BaseValidationDTO {
  //  List<Validations> validations;
    public List<RequiredValidatorDTO> requiredValidator;
    public List<EmailValidatorDTO> emailValidator;
    public List<NumberValidatorDTO> numberValidator;
    public List<StringValidatorDTO> stringValidator;
    public List<ScriptValidatorDTO> scriptValidator;
    public List<CaptchaValidatorDTO> captchaValidator;
//    public List<OnClick> onClick;
    public List<SelectionValidationDTO> selectionValidation;
    public List<DateRangeValidatorDTO> dateRangeValidator;

}
