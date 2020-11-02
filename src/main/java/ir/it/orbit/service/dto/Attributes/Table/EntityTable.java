package ir.it.orbit.service.dto.Attributes.Table;

import lombok.Data;

import java.util.List;

@Data
public class EntityTable {
    public Boolean editable;
    public String name;
    public List<PropertyTable> property;
    public String id;
    public String label;
    public String value;

}
