package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class CheckBoxItemDTO {
    public LayoutDataDTO layoutData;
    public ListenersDTO listeners;
    public Boolean visible;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String tooltip;
    public String name;
    public String label;
    public Boolean rendered;
    public String value;
    public Boolean selected;
    public Boolean enabled;
    public EventAllDTO events;
}
