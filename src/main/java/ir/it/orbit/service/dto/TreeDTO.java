package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.Tree.Columns;
import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class TreeDTO {
    public Listeners listeners;
    public Boolean lazy;
    public Boolean sortByQuery;
    public Boolean layoutable;
    public String validators;
    public Columns columns;
    public String datas;
    public String label;
    public Boolean enabled;
    public LayoutData layoutData;
    public Integer autoExpandLevel;
    public Boolean expandAll;
    public String name;
    public String headerText;
    public String selectionMode;
    public EventAll events;
}
