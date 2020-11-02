package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.Tree.ColumnsDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class TreeDTO {
    public ListenersDTO listeners;
    public Boolean lazy;
    public Boolean sortByQuery;
    public Boolean layoutable;
    public String validators;
    public ColumnsDTO columns;
    public String datas;
    public String label;
    public Boolean enabled;
    public LayoutDataDTO layoutData;
    public Integer autoExpandLevel;
    public Boolean expandAll;
    public String name;
    public String headerText;
    public String selectionMode;
    public EventAllDTO events;
}
