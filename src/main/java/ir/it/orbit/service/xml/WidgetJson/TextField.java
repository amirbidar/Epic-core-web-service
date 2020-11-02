package ir.it.orbit.service.xml.WidgetJson;

import ir.it.orbit.service.xml.Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TextField {
    public String tooltip;
    @JsonProperty("max-length")
    public Integer maxLength;
    public Boolean layoutable;
    @JsonProperty("default-widget")
    public Boolean defaultWidget;
    public Boolean formatNumber;
    public String label;
    public Boolean enabled;
    public String direction;
    public Boolean readonly;
    public String name;
    public String value;
    public Listeners listeners;
    public BaseValidation validators;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public EventAll events;
    public BaseConverter converter;



}
