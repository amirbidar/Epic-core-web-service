package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class CurrencyDTO {

    public ListenersDTO listeners;
    public Boolean layoutable;
    public String validators;
    public Integer rates;
    public String tooltip;
    public Integer maxLength;
    public String main;
    public Boolean defaultWidget;
    public String label;
    public Boolean enabled;
    public LayoutDataDTO layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAllDTO events;
}
