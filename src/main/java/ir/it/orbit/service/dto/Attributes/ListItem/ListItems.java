package ir.it.orbit.service.dto.Attributes.ListItem;

import lombok.Data;

import java.util.List;

@Data
public class ListItems {
    public List<ListItem> item;
    public String condition;
    public String var;
    public String emptyLabel;
    public String value;
}
