package ir.it.orbit.service.dto.Attributes.EditableTable;

import lombok.Data;

@Data
public class DataEditableTable {
    public String condition;
    public String var;
    public String value;
    public EntityEditableGrid entity;

}