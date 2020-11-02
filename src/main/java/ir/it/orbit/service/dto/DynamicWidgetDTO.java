package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import lombok.Data;

@Data
public class DynamicWidgetDTO {
    public String renderer;
    public LayoutData layoutData;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String label;
    public String properties;
    public Boolean enabled;
    public EventAll events;
}
