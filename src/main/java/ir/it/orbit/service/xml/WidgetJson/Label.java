package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Label {
    public Boolean layoutable;
    private String fullPath;
    private String visible;
    private String rendered;
    public String tooltip;
    public String name;
    public String label;
    public String value;
    public Boolean enabled;
    public EventAll events;
    public Listeners listeners;
    @JsonProperty("layout-data")
    public LayoutData layoutData;


}
