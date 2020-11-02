package ir.it.orbit.service.xml.Attributes.RadioGroup;

import ir.it.orbit.service.xml.WidgetJson.RadioItem;
import lombok.Data;

import java.util.List;

@Data
public class ItemRadioGroup {
    public List<RadioItem> radio;
    public String condition;
    public String var;
    public String value;

}
