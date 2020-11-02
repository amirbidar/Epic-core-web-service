package ir.it.orbit.service.xml.Attributes.DatePicker;

import ir.it.orbit.service.xml.Base.Validationss.DateRangeValidator;
import ir.it.orbit.service.xml.Base.Validationss.RequiredValidator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DatePickerValidators {
    @JsonProperty("required-validator")
    public List<RequiredValidator> requiredValidator;
    @JsonProperty("date-range-validator")
    public List<DateRangeValidator> dateRangeValidator;
}
