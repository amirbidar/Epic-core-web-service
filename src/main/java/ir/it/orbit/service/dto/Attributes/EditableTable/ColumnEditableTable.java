package ir.it.orbit.service.dto.Attributes.EditableTable;

import lombok.Data;

@Data
public class ColumnEditableTable {
    public CellEditor cellEditor;
    public String name;
    public Integer width;
    public String header;
    public String alignment;
    public String type;
    public Boolean visible;
    public String color;
    public String icon;
}
