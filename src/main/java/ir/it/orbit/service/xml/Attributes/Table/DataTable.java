package ir.it.orbit.service.xml.Attributes.Table;

import lombok.Data;

import java.util.List;

@Data
public class DataTable {
    public String condition;
    public String var;
    public String value;
    public List<EntityTable> entity;
}
