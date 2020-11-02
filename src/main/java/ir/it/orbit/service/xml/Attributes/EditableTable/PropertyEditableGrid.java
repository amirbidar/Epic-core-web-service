package ir.it.orbit.service.xml.Attributes.EditableTable;

import ir.it.orbit.service.xml.Base.BaseConverter;
import lombok.Data;

@Data
public class PropertyEditableGrid {
    public BaseConverter converter;
    public String name;
    public String value;
}
