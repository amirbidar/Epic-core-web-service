package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.Composite.Border;
import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.dto.Base.Children;
import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.LayoutData;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class CompositeDTO {
    public Layout layout;
    public Border border;
    public LayoutData layoutData;
    public Listeners listeners;
    public Children children;
    public Boolean layoutable;
    public String name;
    public String label;
    public Boolean enabled;
    public EventAll events;
}
