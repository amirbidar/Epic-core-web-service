package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Currency {

    public Listeners listeners;
    public Boolean layoutable;
    public String validators;
    public Integer rates;
    public String tooltip;
    @JsonProperty("max-length")
    public int maxLength;
    public String main;
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
