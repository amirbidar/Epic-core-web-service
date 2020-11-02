package ir.it.orbit.service.xml.Attributes.Table;

import ir.it.orbit.service.xml.Base.BaseConverter;
import lombok.Data;

@Data
public class PropertyTable {
    public BaseConverter converter;
    public String name;
    public String value;
}
