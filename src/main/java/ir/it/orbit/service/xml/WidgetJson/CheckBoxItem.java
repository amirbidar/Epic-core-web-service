package ir.it.orbit.service.xml.WidgetJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.xml.Base.*;
import lombok.Data;

@Data
public class CheckBoxItem {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean visible;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String name;
    public String label;
    public Boolean rendered;
    public String value;
    public Boolean selected;
    public Boolean enabled;
    public EventAll events;
}
