package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.LookUp.DataLookUp;
import ir.it.orbit.service.dto.Attributes.LookUp.column;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class LookupDTO {
    public Listeners listeners;
    public DataLookUp data;
    public Boolean layoutable;
    public BaseValidation validators;
    public column columns;
    public BaseConverter converter;
    public String tooltip;
    public Boolean fullTextSearch;
    public String label;
    public Boolean enabled;
    public String popupTitle;
    public LayoutData layoutData;
    public Boolean readonly;
    public BasePagination paginationBar;
    public Integer width;
    public String name;
    public String header;
    public Integer defaultPageSize;
    public Boolean enableSort;
    public String value;
    public EventAll events;
    public Integer height;
}
