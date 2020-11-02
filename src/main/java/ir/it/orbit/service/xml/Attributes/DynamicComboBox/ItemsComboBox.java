package ir.it.orbit.service.xml.Attributes.DynamicComboBox;

import ir.it.orbit.service.xml.Attributes.StaticComboBox.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ItemsComboBox {
    public String condition;
    public List<Item> item;
    public String var;
    @JsonProperty("empty-item-label")
    public String emptyItemLabel;
    public String value;
}
