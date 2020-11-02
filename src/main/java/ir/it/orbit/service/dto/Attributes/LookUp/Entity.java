package ir.it.orbit.service.dto.Attributes.LookUp;

import lombok.Data;

import java.util.List;

@Data
public class Entity {
    public Boolean editable;
    public String name;
    public List<Property> property;
    public Integer id;
    public String label;
    public String value;
}

