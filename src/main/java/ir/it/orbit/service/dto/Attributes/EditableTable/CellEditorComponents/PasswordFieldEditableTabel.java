package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.BaseValidationDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import lombok.Data;

@Data
public class PasswordFieldEditableTabel {
    public Boolean readonly;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public String tooltip;
    public String name;
    public Integer maxLength;
    public boolean defaultWidget;
    public String label;
    public String value;
    public Boolean enabled;
    public EventAllDTO events;
}
