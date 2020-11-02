package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
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
    public EventAllDTO events;
    public ListenersDTO listeners;
    public LayoutDataDTO layoutData;


}
