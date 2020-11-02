package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Link {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String href;
    public String text;
    public String label;
    public Boolean enabled;
    public EventAll events;
    public String target;
}
