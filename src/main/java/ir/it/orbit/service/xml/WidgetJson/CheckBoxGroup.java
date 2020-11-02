package ir.it.orbit.service.xml.WidgetJson;


import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.xml.Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.xml.Base.*;
import lombok.Data;

@Data
public class CheckBoxGroup {
    public Layout layout;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public BaseValidation validators;
    public String name;
    public String label;
    public String value;
    public BaseConverter converter;
    public Boolean layoutable;
    public Listeners listeners;
    public ItemCheckBoxGroup items;
    public Boolean enabled;

    public EventAll events;
}
