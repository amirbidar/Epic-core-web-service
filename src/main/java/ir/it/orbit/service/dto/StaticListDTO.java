package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.ListItem.ListItems;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class StaticListDTO {
    public LayoutData layoutData;
    public BaseValidation validators;
    public Listeners listeners;
    public String name;
    public ListItems items;
    public String selectionMode;
    public Boolean enabled;
    public EventAll events;
    public Boolean layoutable;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public String value;
}
