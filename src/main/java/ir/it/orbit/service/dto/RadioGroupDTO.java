package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import ir.it.orbit.service.dto.Attributes.RadioGroup.ItemRadioGroupDTO;
import ir.it.orbit.service.dto.Base.*;

public class RadioGroupDTO {

    public LayoutDTO layout;
    public LayoutDataDTO layoutData;
    public ListenersDTO listeners;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String name;
    public String label;
    public String value;
    public ItemRadioGroupDTO items;
    public Boolean enabled;
    public EventAllDTO events;
}
