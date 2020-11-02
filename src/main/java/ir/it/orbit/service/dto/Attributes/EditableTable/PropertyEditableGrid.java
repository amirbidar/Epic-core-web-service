package ir.it.orbit.service.dto.Attributes.EditableTable;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import lombok.Data;

@Data
public class PropertyEditableGrid {
    public BaseConverterDTO converter;
    public String name;
    public String value;
}
