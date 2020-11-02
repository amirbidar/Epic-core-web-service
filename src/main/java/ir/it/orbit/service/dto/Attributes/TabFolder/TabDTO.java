package ir.it.orbit.service.dto.Attributes.TabFolder;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class TabDTO {
        public LayoutDTO layout;
        public ListenersDTO listeners;
        public Boolean layoutable;
        public String tooltip;
        public String icon;
        public String name;
        public String label;
        public String title;
        public Boolean enabled;
        public EventAllDTO events;
}
