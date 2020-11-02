package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class DynamicCheckboxDTO {
    public String visible;
    public ListenersDTO listeners;
    public String layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String tooltip;
    public String label;
    public String enabled;
    public LayoutDataDTO layoutData;
    public String rendered;
    public String name;
    public String value;
    public String selected;
    public EventAllDTO events;
}
