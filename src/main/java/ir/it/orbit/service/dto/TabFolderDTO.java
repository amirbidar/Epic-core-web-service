package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.TabFolder.TabsDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class TabFolderDTO {
    public LayoutDataDTO layoutData;
    public ListenersDTO listeners;
    public Boolean layoutable;
    public String name;
    public TabsDTO tabs;
    public String label;
    public Boolean enabled;
    public EventAllDTO events;
}
