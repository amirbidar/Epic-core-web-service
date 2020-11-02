package ir.it.orbit.service.dto.Base;

import ir.it.orbit.service.dto.Base.Validationss.*;
import lombok.Data;

import java.util.List;

@Data

public class BaseValidationDTO {
  //  List<Validations> validations;
    public List<RequiredValidator> requiredValidator;
    public List<EmailValidator> emailValidator;
    public List<NumberValidator> numberValidator;
    public List<StringValidator> stringValidator;
    public List<ScriptValidator> scriptValidator;
    public List<CaptchaValidator> captchaValidator;
//    public List<OnClick> onClick;
    public List<SelectionValidation> selectionValidation;
    public List<DateRangeValidator> dateRangeValidator;
}
