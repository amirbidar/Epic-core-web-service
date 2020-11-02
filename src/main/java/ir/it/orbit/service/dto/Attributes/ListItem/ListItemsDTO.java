package ir.it.orbit.service.dto.Attributes.ListItem;

import lombok.Data;

import java.util.List;

@Data
public class ListItemsDTO {
    public List<ListItemDTO> item;
    public String condition;
    public String var;
    public String emptyLabel;
    public String value;
}
