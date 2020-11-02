package ir.it.orbit.service.dto.Base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ir.it.orbit.service.dto.Base.EventListeners.*;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class EventAllDTO {
    public List<OnLoadDTO> onLoad;
    public List<OnSelectDTO> onSelect;
    public List<OnChangeDTO> onChange;
    public List<OnDeselectDTO> onDeselect;
    public List<OnFocusLostDTO> onFocusLost;
    public List<OnEditDTO> onEdit;
    public List<OnLastDTO> onLast;
    public List<OnPreviousDTO> onPrevious;
    public List<OnSearchDTO> onSearch;
    public List<OnNextDTO> onNext;
    public List<OnFirstDTO> onFirst;
    public List<OnRefreshDTO> onRefresh;
    public List<OnSelectionChangeDTO> onSelectionChange;
    /*public List<OnClick> onClick;*/
    public List<OnDoubleClickDTO> onDoubleClicks;
    public List<OnRowActionDTO> onRowActions;

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
