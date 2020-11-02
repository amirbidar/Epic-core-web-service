package ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.xml.Base.BaseConverter;
import ir.it.orbit.service.xml.Base.BaseValidation;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TextFieldEditableTabel {

    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    @JsonProperty("max-length")
    public Integer maxLength;
    @JsonProperty("default-widget")
    public Boolean defaultWidget;
    public Boolean formatNumber;
    public String label;
    public Boolean enabled;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAll events;
    public EnumsDecleration.Direction direction;
}
