package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.Composite.BorderDTO;
import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import ir.it.orbit.service.dto.Base.ChildrenDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class CompositeDTO {
    public LayoutDTO layout;
    public BorderDTO border;
    public LayoutDataDTO layoutData;
    public ListenersDTO listeners;
    public ChildrenDTO children;
    public Boolean layoutable;
    public String name;
    public String label;
    public Boolean enabled;
    public EventAllDTO events;
}
