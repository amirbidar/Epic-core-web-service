package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Attributes.LookUp.DataLookUp;
import ir.it.orbit.service.xml.Attributes.LookUp.column;
import ir.it.orbit.service.xml.Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Lookup {
    public Listeners listeners;
    public DataLookUp data;
    public Boolean layoutable;
    public BaseValidation validators;
    public column columns;
    public BaseConverter converter;
    public String tooltip;
    @JsonProperty("full-text-search")
    public Boolean fullTextSearch;
    public String label;
    public Boolean enabled;
    @JsonProperty("popup-title")
    public String popupTitle;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Boolean readonly;
    @JsonProperty("pagination-bar")
    public BasePagination paginationBar;
    public Integer width;
    public String name;
    public String header;
    @JsonProperty("default-page-size")
    public Integer defaultPageSize;
    @JsonProperty("enable-sort")
    public Boolean enableSort;
    public String value;
    public EventAll events;
    public Integer height;
}
