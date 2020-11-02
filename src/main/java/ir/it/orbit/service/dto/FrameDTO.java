package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import lombok.Data;

@Data
public class FrameDTO {
    public LayoutData layoutData;
    public Boolean layoutable;
    public String name;
    public String label;
    public String url;
    public Boolean enabled;
    public EventAll events;
}
