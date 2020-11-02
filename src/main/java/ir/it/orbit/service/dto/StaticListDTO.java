package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.ListItem.ListItems;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class StaticListDTO {
    public LayoutDataDTO layoutData;
    public BaseValidationDTO validators;
    public ListenersDTO listeners;
    public String name;
    public ListItems items;
    public String selectionMode;
    public Boolean enabled;
    public EventAllDTO events;
    public Boolean layoutable;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public String value;
}
