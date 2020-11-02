package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.StaticComboBox.ItemsComboBox;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class DynamicComboBoxDTO {

    public ListenersDTO listeners;
    public Boolean editable;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public LayoutDataDTO layoutData;
    public String name;
    public String value;
    public ItemsComboBox items;
    public EventAllDTO events;

}
