package ir.it.orbit.service.dto.Attributes.EditableTable;

import lombok.Data;

@Data
public class DataEditableTableDTO {
    public String condition;
    public String var;
    public String value;
    public EntityEditableGridDTO entity;

}
