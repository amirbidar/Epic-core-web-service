package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.DatePicker.DatePickerValidators;
import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
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
    public ListenersDTO listeners;
    public EventAllDTO events;
    public DatePickerValidators validators;
    public BaseConverterDTO converter;
    private LayoutDataDTO layoutData;

}
