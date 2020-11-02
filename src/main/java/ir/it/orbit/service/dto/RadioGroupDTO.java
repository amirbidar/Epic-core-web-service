package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.dto.Attributes.RadioGroup.ItemRadioGroup;
import ir.it.orbit.service.dto.Base.*;

public class RadioGroupDTO {

    public Layout layout;
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
