package ir.it.orbit.service.dto.Attributes.Table;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import lombok.Data;

@Data
public class PropertyTable {
    public BaseConverterDTO converter;
    public String name;
    public String value;
}
