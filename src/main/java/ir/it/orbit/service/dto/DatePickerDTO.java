package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;


@Data
public class DatePickerDTO {
    public  Boolean layoutable;
    public  String tooltip;
    public  String label;
    public  Boolean enabled;
    public  EnumsDecleration.DatePickerMode mode;
    public  Boolean readonly;
    public  EnumsDecleration.DatePickerCalenderMode calendarMode;
    public  String name;
    public  String value;
    public  ListenersDTO listeners;
    public  EventAllDTO events;
    public  BaseValidationDTO validators;
    public  BaseConverterDTO converter;
    public  LayoutDataDTO layoutData;

}
