package ir.it.orbit.service.xml.Attributes.LookUp;

import lombok.Data;

import java.util.List;

@Data
public class DataLookUp {
    public String condition;
    public String var;
    public String value;
    public List<Entity> entity;
}
