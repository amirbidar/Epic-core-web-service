package ir.it.orbit.service.dto.Base;

import lombok.Data;

@Data
public class BaseConverter {
    private String factory;
    public String toObject;
    public String toValue;
    public Boolean avoidNullValues;
}
