package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import lombok.Data;

@Data
public class FrameDTO {
    public LayoutDataDTO layoutData;
    public Boolean layoutable;
    public String name;
    public String label;
    public String url;
    public Boolean enabled;
    public EventAllDTO events;
}
