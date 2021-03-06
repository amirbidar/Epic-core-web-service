package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.ListItem.ListItemsDTO;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class StaticListDTO {
    public LayoutDataDTO layoutData;
    public BaseValidationDTO validators;
    public ListenersDTO listeners;
    public String name;
    public ListItemsDTO items;
    public String selectionMode;
    public Boolean enabled;
    public EventAllDTO events;
    public Boolean layoutable;
    public BaseConverterDTO converter;
    public String tooltip;
    public String label;
    public String value;
}
