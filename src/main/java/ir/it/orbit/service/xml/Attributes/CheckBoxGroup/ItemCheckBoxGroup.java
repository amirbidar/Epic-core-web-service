package ir.it.orbit.service.xml.Attributes.CheckBoxGroup;

import ir.it.orbit.service.xml.WidgetJson.CheckBoxItem;
import lombok.Data;

import java.util.List;

@Data
public class ItemCheckBoxGroup {

    public List<CheckBoxItem> checkbox;
    public String condition;
    public String var;
    public String value;
}
