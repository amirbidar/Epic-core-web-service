package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class LinkDTO {
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String href;
    public String text;
    public String label;
    public Boolean enabled;
    public EventAll events;
    public String target;
}