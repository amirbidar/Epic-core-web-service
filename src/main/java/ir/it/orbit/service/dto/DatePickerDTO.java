package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.DatePicker.DatePickerValidators;
import ir.it.orbit.service.dto.Base.BaseConverter;
import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;


@Data
public class DatePickerDTO {
    public Boolean layoutable;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public EnumsDecleration.DatePickerMode mode;
    public Boolean readonly;
    public EnumsDecleration.DatePickerCalenderMode calendarMode;
    public String name;
    public String value;
    public Listeners listeners;
    public EventAll events;
    public DatePickerValidators validators;
    public BaseConverter converter;
    private LayoutData layoutData;

}
