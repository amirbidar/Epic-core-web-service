package ir.it.orbit.service.dto.Attributes.StaticComboBox;

import ir.it.orbit.service.dto.Base.BaseConverter;
import lombok.Data;

@Data
public class Item {
    public BaseConverter converter;
    public String name;
    public String icon;
    public String label;
    public String value;
}
