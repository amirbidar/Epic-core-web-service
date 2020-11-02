package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class CheckBoxGroupDTO {
    public LayoutDTO layout;
    public LayoutDataDTO layoutData;
    public BaseValidationDTO validators;
    public String name;
    public String label;
    public String value;
    public BaseConverter converter;
    public Boolean layoutable;
    public ListenersDTO listeners;
    public ItemCheckBoxGroup items;
    public Boolean enabled;

    public EventAllDTO events;
}
