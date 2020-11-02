package ir.it.orbit.service.dto.Attributes.ListItem;

import ir.it.orbit.service.dto.Base.BaseConverter;
import lombok.Data;

@Data
public class ListItem {
    public BaseConverter converter;
    public String name;
    public String icon;
    public String label;
    public String value;
}
