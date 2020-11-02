package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class CheckBoxItemDTO {
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean visible;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String name;
    public String label;
    public Boolean rendered;
    public String value;
    public Boolean selected;
    public Boolean enabled;
    public EventAll events;
}
