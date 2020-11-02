package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class TextFieldDTO {
    public String tooltip;
    public Integer maxLength;
    public Boolean layoutable;
    public Boolean defaultWidget;
    public Boolean formatNumber;
    public String label;
    public Boolean enabled;
    public String direction;
    public Boolean readonly;
    public String name;
    public String value;
    public Listeners listeners;
    public BaseValidation validators;
    public LayoutData layoutData;
    public EventAll events;
    public BaseConverter converter;



}
