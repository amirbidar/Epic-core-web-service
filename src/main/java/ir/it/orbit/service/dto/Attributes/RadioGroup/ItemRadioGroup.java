package ir.it.orbit.service.dto.Attributes.RadioGroup;

import ir.it.orbit.service.dto.*;
import lombok.Data;

import java.util.List;

@Data
public class ItemRadioGroup {
    public List<RadioItemDTO> radio;
    public String condition;
    public String var;
    public String value;

}
