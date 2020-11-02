package ir.it.orbit.service.dto.Attributes.Tree;

import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class ColumnDTO {
    public String name;
    public String icon;
    public Integer width;
    public String header;
    public Boolean sortable;
    public EnumsDecleration.ColumnAlignment alignment;
    public String type;
    public Boolean visible;
    public String color;



}
