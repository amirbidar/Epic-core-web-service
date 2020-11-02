package ir.it.orbit.service.dto.Base;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import lombok.Data;

@Data
public class PopupDTO {

    public LayoutDTO layout;
    public Boolean visible;
    public Boolean rendered;
    public Boolean draggable;
    public Boolean resizable;
    public ChildrenDTO children;
    public Boolean layoutable;
    public String name;
    public String label;
    public String title;
    public Boolean enabled;
    public EventAllDTO events;
    public ListenersDTO listeners;
}
