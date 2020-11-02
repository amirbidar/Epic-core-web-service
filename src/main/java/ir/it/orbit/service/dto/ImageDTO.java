package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import lombok.Data;

@Data
public class ImageDTO {
    public LayoutData layoutData;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String label;
    public Boolean url;
    public Boolean enabled;
    public EventAll events;

}
