package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;

public class RadioItemDTO {
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String name;
    public String label;
    public String value;
    public Boolean enabled;
    public Boolean visible;
    public Boolean rendered;
    public EventAll events;
}
