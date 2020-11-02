package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class ButtonDTO {
    public ListenersDTO listeners;
    public LayoutDataDTO layoutData;
    public EventAllDTO events;
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
