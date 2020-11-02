package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import ir.it.orbit.service.xml.Base.BaseValidation;
import lombok.Data;

@Data
public class DatePickerEditableTabelDTO {
    public ListenersDTO listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverterDTO converter;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public String mode;
    public Boolean readonly;
    public String calendarMode;
    public String name;
    public String value;
    public EventAllDTO events;
}
