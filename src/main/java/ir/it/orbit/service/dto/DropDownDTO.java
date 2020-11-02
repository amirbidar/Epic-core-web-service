package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.StaticComboBox.ItemsComboBox;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class DropDownDTO {
    public Listeners listeners;
    public Boolean editable;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public LayoutData layoutData;
    public String name;
    public String value;
    public ItemsComboBox items;
    public EventAll events;
}
