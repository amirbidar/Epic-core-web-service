package ir.it.orbit.service.dto.Attributes.EditableTable;

import lombok.Data;

import java.util.List;

@Data
public class EntityEditableGridDTO {

    public Boolean editable;
    public String name;
    public List<PropertyEditableGridDTO> property;
    public Integer id;
    public String label;
    public String value;
}
