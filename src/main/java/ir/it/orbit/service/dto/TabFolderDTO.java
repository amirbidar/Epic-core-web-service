package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.TabFolder.Tabs;
import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class TabFolderDTO {
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public String name;
    public Tabs tabs;
    public String label;
    public Boolean enabled;
    public EventAll events;
}
