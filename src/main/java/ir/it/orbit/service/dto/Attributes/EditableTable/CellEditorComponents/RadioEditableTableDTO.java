package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class RadioEditableTableDTO {
    public LayoutDataDTO layoutData;
    public ListenersDTO listeners;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String name;
    public Boolean label;
    public String value;
    public Boolean enabled;
    public EventAllDTO events;
}
