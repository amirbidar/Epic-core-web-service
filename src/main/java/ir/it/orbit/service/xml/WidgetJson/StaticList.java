package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.ListItem.ListItems;
import ir.it.orbit.service.xml.Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StaticList {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public BaseValidation validators;
    public Listeners listeners;
    public String name;
    public ListItems items;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public Boolean enabled;
    public EventAll events;
    public Boolean layoutable;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public String value;
}
