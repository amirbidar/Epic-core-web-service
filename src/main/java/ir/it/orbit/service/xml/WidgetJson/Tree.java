package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.Tree.Columns;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.Base.LayoutData;
import ir.it.orbit.service.xml.Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tree {
    public Listeners listeners;
    public Boolean lazy;
    @JsonProperty("sort-by-query")
    public Boolean sortByQuery;
    public Boolean layoutable;
    public String validators;
    public Columns columns;
    public String datas;
    public String label;
    public Boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    @JsonProperty("auto-expand-level")
    public Integer autoExpandLevel;
    @JsonProperty("expand-all")
    public Boolean expandAll;
    public String name;
    @JsonProperty("header-text")
    public String headerText;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public EventAll events;
}
