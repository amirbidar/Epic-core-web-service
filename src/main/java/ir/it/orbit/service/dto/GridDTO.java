package ir.it.orbit.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.dto.Attributes.Table.DataTable;
import ir.it.orbit.service.dto.Attributes.Tree.Columns;
import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class GridDTO {
    public Listeners listeners;
    public DataTable data;
    public Boolean layoutable;
    public BaseValidation validators;
    public Columns columns;
    public String label;
    public Boolean enabled;
    public LayoutData layoutData;
    public BasePagination paginationBar;
    public String name;
    public String header;
    public Integer defaultPageSize;
    @JsonProperty("enable-sort")
    public Boolean enableSort;
    @JsonProperty("selection-mode")
    public EnumsDecleration.TableSelectionMode selectionMode;
    public EventAll events;
}
