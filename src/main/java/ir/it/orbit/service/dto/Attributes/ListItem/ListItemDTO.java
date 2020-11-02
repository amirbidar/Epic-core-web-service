package ir.it.orbit.service.dto.Attributes.ListItem;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import lombok.Data;

@Data
public class ListItemDTO {
    public BaseConverterDTO converter;
    public String name;
    public String icon;
    public String label;
    public String value;
}
