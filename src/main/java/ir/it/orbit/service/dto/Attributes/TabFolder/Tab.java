package ir.it.orbit.service.dto.Attributes.TabFolder;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.Layout;
import ir.it.orbit.service.dto.Base.EventAll;
import ir.it.orbit.service.dto.Base.Listeners;
import lombok.Data;

@Data
public class Tab {
        public Layout layout;
        public Listeners listeners;
        public Boolean layoutable;
        public String tooltip;
        public String icon;
        public String name;
        public String label;
        public String title;
        public Boolean enabled;
        public EventAll events;
}
