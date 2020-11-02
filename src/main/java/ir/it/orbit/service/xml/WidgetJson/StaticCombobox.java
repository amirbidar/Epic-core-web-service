package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.Items;
import ir.it.orbit.service.xml.Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StaticCombobox {
    public Listeners listeners;
    public Boolean editable;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public Boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String name;
    public String value;
    public Items items;
    public EventAll events;
}
