package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class ButtonDTO {
    public Listeners listeners;
    public LayoutData layoutData;
    public EventAll events;
    public Boolean layoutable;
    public String tooltip;
    public String caption;
    public String iconUrl;
    public Integer iconHeight;
    public String label;
    public Boolean enabled;
    public Boolean defaultKey;
    public String name;
    public EnumsDecleration.ButtonAction action;
    public Boolean visible;
    public Integer iconWidth;

}
