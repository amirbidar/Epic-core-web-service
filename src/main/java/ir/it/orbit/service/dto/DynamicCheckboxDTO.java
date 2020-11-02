package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class DynamicCheckboxDTO {
    public String visible;
    public Listeners listeners;
    public String layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public String enabled;
    public LayoutData layoutData;
    public String rendered;
    public String name;
    public String value;
    public String selected;
    public EventAll events;
}
