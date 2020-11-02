package ir.it.orbit.service.dto.Attributes.DatePicker;

import ir.it.orbit.service.dto.Base.Validationss.DateRangeValidator;
import ir.it.orbit.service.dto.Base.Validationss.RequiredValidator;
import lombok.Data;

import java.util.List;

@Data
public class DatePickerValidators {
    public List<RequiredValidator> requiredValidator;
    public List<DateRangeValidator> dateRangeValidator;
}
