package ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents;

import ir.it.orbit.service.xml.Attributes.Form.GridLayout;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Layout {
    @JsonProperty("grid-layout")
    public GridLayout gridLayout;
}
