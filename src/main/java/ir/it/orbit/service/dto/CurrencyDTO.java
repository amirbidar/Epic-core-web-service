package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class CurrencyDTO {

    public Listeners listeners;
    public Boolean layoutable;
    public String validators;
    public Integer rates;
    public String tooltip;
    public int maxLength;
    public String main;
    public Boolean defaultWidget;
    public String label;
    public Boolean enabled;
    public LayoutData layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAll events;
}
