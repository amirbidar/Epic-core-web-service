package ir.it.orbit.service.xml.WidgetJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.xml.Base.*;
import ir.it.orbit.service.xml.Enum.EnumsDecleration;
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
    public BaseValidation validators;
    public BaseConverter converter;
    @JsonProperty("layout-data")
    private LayoutData layoutData;

}
