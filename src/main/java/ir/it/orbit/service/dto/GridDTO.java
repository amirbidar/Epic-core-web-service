package ir.it.orbit.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.dto.Attributes.Table.DataTable;
import ir.it.orbit.service.dto.Attributes.Tree.Columns;
import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class GridDTO {
    public ListenersDTO listeners;
    public DataTable data;
    public Boolean layoutable;
    public BaseValidationDTO validators;
    public Columns columns;
    public String label;
    public Boolean enabled;
    public LayoutDataDTO layoutData;
    public BasePaginationDTO paginationBar;
    public String name;
    public String header;
    public Integer defaultPageSize;
    @JsonProperty("enable-sort")
    public Boolean enableSort;
    @JsonProperty("selection-mode")
    public EnumsDecleration.TableSelectionMode selectionMode;
    public EventAllDTO events;
}
