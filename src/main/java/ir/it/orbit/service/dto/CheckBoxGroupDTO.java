package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class CheckBoxGroupDTO {
    public Layout layout;
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
