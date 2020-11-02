package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.DatePicker.DatePickerValidators;
import ir.it.orbit.service.xml.Base.BaseConverter;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import ir.it.orbit.service.xml.Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DatePicker {
    public Boolean layoutable;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public String mode;
    public Boolean readonly;
    public EnumsDecleration.DatePickerCalenderMode calendarMode;
    public String name;
    public String value;
    public Listeners listeners;
    public EventAll events;
    public DatePickerValidators validators;
    public BaseConverter converter;
    @JsonProperty("layout-data")
    private LayoutData layoutData;

}
