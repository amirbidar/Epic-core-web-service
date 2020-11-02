package ir.it.orbit.service.dto.Base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ir.it.orbit.service.dto.Base.EventListeners.*;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class EventAllDTO {
    public List<OnLoad> onLoad;
    public List<OnSelect> onSelect;
    public List<OnChange> onChange;
    public List<OnDeselect> onDeselect;
    public List<OnFocusLost> onFocusLost;
    public List<OnEdit> onEdit;
    public List<OnLast> onLast;
    public List<OnPrevious> onPrevious;
    public List<OnSearch> onSearch;
    public List<OnNext> onNext;
    public List<OnFirst> onFirst;
    public List<OnRefresh> onRefresh;
    public List<OnSelectionChange> onSelectionChange;
    public List<OnClick> onClick;
    public List<OnDoubleClick> onDoubleClicks;
    public List<OnRowAction> onRowActions;

   /* @JsonProperty("on-load")
    public OnLoad onLoad2;
    @JsonProperty("on-select")
    public OnSelect onSelect2;
    @JsonProperty("on-change")
    public OnChange onChange2;
    @JsonProperty("on-deselect")
    public OnDeselect onDeselect2;
    @JsonProperty("on-focus-lost")
    public OnFocusLost onFocusLost2;
    @JsonProperty("on-edit")
    public OnEdit onEdit2;
    @JsonProperty("on-last")
    public OnLast onLast2;
    @JsonProperty("on-previous")
    public OnPrevious onPrevious2;
    @JsonProperty("on-search")
    public OnSearch onSearch2;
    @JsonProperty("on-next")
    public OnNext onNext2;
    @JsonProperty("on-first")
    public OnFirst onFirst2;
    @JsonProperty("on-refresh")
    public OnRefresh onRefresh2;
    @JsonProperty("on-selection-change")
    public OnSelectionChange onSelectionChange2;*/



}
