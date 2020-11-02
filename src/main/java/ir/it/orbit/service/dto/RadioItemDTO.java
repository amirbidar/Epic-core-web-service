package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;

public class RadioItemDTO {
    public LayoutDataDTO layoutData;
    public ListenersDTO listeners;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public BaseConverterDTO converter;
    public String name;
    public String label;
    public String value;
    public Boolean enabled;
    public Boolean visible;
    public Boolean rendered;
    public EventAllDTO events;
}
