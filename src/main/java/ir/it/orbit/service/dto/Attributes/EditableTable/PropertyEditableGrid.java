package ir.it.orbit.service.dto.Attributes.EditableTable;

import ir.it.orbit.service.dto.Base.BaseConverter;
import lombok.Data;

@Data
public class PropertyEditableGrid {
    public BaseConverter converter;
    public String name;
    public String value;
}
