package ir.it.orbit.service.dto.Attributes.DynamicComboBox;

import ir.it.orbit.service.dto.Attributes.StaticComboBox.Item;
import lombok.Data;

import java.util.List;

@Data
public class ItemsComboBox {
    public String condition;
    public List<Item> item;
    public String var;
    public String emptyItemLabel;
    public String value;
}
