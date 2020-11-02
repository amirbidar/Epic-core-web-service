package ir.it.orbit.service.xml.WidgetJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import lombok.Data;

;

@Data
public class Button {
    public Listeners listeners;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public EventAll events;
    public Boolean layoutable;
    public String tooltip;
    public String caption;
    @JsonProperty("icon-url")
    public String iconUrl;
    @JsonProperty("icon-height")
    public Integer iconHeight;
    public String label;
    public Boolean enabled;
    @JsonProperty("default-key")
    public Boolean defaultKey;
    public String name;
    public String action;
    public Boolean visible;
    @JsonProperty("icon-width")
    public Integer iconWidth;

}
