package ir.it.orbit.service.dto.Attributes.StaticComboBox;

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
