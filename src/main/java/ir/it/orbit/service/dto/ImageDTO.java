package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import lombok.Data;

@Data
public class ImageDTO {
    public LayoutDataDTO layoutData;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String label;
    public Boolean url;
    public Boolean enabled;
    public EventAllDTO events;

}
