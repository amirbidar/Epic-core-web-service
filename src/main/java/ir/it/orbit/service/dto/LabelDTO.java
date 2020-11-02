package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class LabelDTO {
    public Boolean layoutable;
    private String fullPath;
    private String visible;
    private String rendered;
    public String tooltip;
    public String name;
    public String label;
    public String value;
    public Boolean enabled;
    public EventAll events;
    public Listeners listeners;
    public LayoutData layoutData;


}
