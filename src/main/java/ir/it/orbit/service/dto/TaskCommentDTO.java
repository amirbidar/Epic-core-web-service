package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.BaseConverter;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class TaskCommentDTO {
    public Listeners listeners;
    public Boolean layoutable;
    public String validators;
    public BaseConverter converter;
    public String tooltip;
    public Integer maxLength;
    public Boolean defaultWidget;
    public Boolean htmlEnabled;
    public String label;
    public Boolean enabled;
    public LayoutData layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public String events;
    public String direction;
}
