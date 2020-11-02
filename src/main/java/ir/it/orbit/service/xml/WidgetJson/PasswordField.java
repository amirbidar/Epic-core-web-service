package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Base.BaseValidation;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PasswordField {
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public String tooltip;
    @JsonProperty("max-length")
    public Integer maxLength;
    @JsonProperty("default-widget")
    public Boolean defaultWidget;
    public String label;
    public Boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAll events;
}
