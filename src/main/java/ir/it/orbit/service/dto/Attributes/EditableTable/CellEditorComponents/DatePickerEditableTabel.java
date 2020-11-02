package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Attributes.DatePicker.DatePickerValidators;
import ir.it.orbit.service.dto.Base.BaseConverter;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class DatePickerEditableTabel {
    public ListenersDTO listeners;
    public Boolean layoutable;
    public DatePickerValidators validators;
    public BaseConverter converter;
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
