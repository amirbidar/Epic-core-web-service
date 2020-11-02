package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class TextareaDTO {
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public Integer maxLength;
    public Boolean defaultWidget;
    public Boolean htmlEnabled;
    public String label;
    public Boolean enabled;
    public LayoutData layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAll events;
    public String direction;


}
