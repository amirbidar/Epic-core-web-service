package ir.it.orbit.service.xml.WidgetJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.xml.Attributes.Composite.Border;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.xml.Base.Children;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import lombok.Data;

@Data
public class Composite {
    public Layout layout;
    public Border border;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Children children;
    public Boolean layoutable;
    public String name;
    public String label;
    public Boolean enabled;
    public EventAll events;
}
