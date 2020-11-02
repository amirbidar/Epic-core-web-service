package ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.dto.Base.BaseConverter;
import ir.it.orbit.service.dto.Base.BaseValidation;
import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class TextAreaEditableTabel {
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public int maxLength;
    public boolean defaultWidget;
    public Boolean htmlEnabled;
    public String label;
    public Boolean enabled;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAll events;
    public EnumsDecleration.Direction direction;
}
