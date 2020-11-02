package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import ir.it.orbit.service.dto.Base.BaseValidationDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class CheckBoxGroupEditableTableDTO {
    public LayoutDTO layout;
    public ListenersDTO listeners;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String name;
    public String label;
    public String value;
    public ItemsDTO items;
    public Boolean enabled;
    public EventAllDTO events;
}
