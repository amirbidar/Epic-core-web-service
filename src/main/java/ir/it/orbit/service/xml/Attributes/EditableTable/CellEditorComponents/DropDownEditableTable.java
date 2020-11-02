package ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.xml.Base.BaseConverter;
import ir.it.orbit.service.xml.Base.BaseValidation;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.Listeners;
import lombok.Data;

@Data
public class DropDownEditableTable {
    public Listeners listeners;
    public Boolean editable;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String name;
    public String label;
    public String value;
    public Items items;
    public Boolean enabled;
    public EventAll events;
}
