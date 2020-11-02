package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.TabFolder.Tabs;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TabFolder {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public String name;
    public Tabs tabs;
    public String label;
    public Boolean enabled;
    public EventAll events;
}
