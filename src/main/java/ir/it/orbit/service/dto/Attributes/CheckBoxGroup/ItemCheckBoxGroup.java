package ir.it.orbit.service.dto.Attributes.CheckBoxGroup;

import ir.it.orbit.service.dto.CheckBoxItemDTO;
import lombok.Data;

import java.util.List;

@Data
public class ItemCheckBoxGroup {

    public List<CheckBoxItemDTO> checkbox;
    public String condition;
    public String var;
    public String value;
}
