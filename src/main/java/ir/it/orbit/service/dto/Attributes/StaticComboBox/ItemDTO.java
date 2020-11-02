package ir.it.orbit.service.dto.Attributes.StaticComboBox;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import lombok.Data;

@Data
public class ItemDTO {
    public BaseConverterDTO converter;
    public String name;
    public String icon;
    public String label;
    public String value;
}
