package ir.it.orbit.service.dto.Attributes.StaticComboBox;

import lombok.Data;

import java.util.List;

@Data
public class ItemsComboBoxDTO {
    public String condition;
    public List<ItemDTO> item;
    public String var;
    public String emptyItemLabel;
    public String value;
}
