package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import ir.it.orbit.service.dto.Base.BaseValidationDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class TextAreaEditableTabel {
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String tooltip;
    public int maxLength;
    public boolean defaultWidget;
    public Boolean htmlEnabled;
    public String label;
    public Boolean enabled;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAllDTO events;
    public EnumsDecleration.Direction direction;
}
