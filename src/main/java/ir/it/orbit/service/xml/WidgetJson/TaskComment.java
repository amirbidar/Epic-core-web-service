package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Base.BaseConverter;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TaskComment {
    public Listeners listeners;
    public Boolean layoutable;
    public String validators;
    public BaseConverter converter;
    public String tooltip;
    @JsonProperty("max-length")
    public Integer maxLength;
    @JsonProperty("default-widget")
    public Boolean defaultWidget;
    @JsonProperty("html-enabled")
    public Boolean htmlEnabled;
    public String label;
    public Boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public String events;
    public String direction;
}
