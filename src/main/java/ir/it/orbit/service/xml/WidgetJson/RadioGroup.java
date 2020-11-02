package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.xml.Attributes.RadioGroup.ItemRadioGroup;
import ir.it.orbit.service.xml.Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RadioGroup {

    public Layout layout;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String name;
    public String label;
    public String value;
    public ItemRadioGroup items;
    public Boolean enabled;
    public EventAll events;
}
