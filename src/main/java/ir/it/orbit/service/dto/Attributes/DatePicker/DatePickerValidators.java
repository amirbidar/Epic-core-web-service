package ir.it.orbit.service.dto.Attributes.DatePicker;

import ir.it.orbit.service.dto.Base.Validationss.DateRangeValidatorDTO;
import ir.it.orbit.service.dto.Base.Validationss.RequiredValidatorDTO;
import lombok.Data;

import java.util.List;

@Data
public class DatePickerValidators {
    public List<RequiredValidatorDTO> requiredValidator;
    public List<DateRangeValidatorDTO> dateRangeValidator;
}
