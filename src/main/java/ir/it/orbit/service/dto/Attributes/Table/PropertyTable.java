package ir.it.orbit.service.dto.Attributes.Table;

import ir.it.orbit.service.dto.Base.BaseConverter;
import lombok.Data;

@Data
public class PropertyTable {
    public BaseConverter converter;
    public String name;
    public String value;
}
