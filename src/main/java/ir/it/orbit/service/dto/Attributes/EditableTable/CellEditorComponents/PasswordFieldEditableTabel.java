package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.BaseValidation;
import ir.it.orbit.service.dto.Base.EventAll;
import lombok.Data;

@Data
public class PasswordFieldEditableTabel {
    public Boolean readonly;
    public Boolean layoutable;
    public BaseValidation validators;
    public String tooltip;
    public String name;
    public Integer maxLength;
    public boolean defaultWidget;
    public String label;
    public String value;
    public Boolean enabled;
    public EventAll events;
}
