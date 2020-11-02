package ir.it.orbit.service.xml.Base.EventListeners;

import ir.it.orbit.service.xml.Base.Argument;
import ir.it.orbit.service.xml.Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class OnDeselect {
    public EnumsDecleration.EventPhase phase;
    @JsonProperty("fire-condition")
    public String fireCondition;
    @JsonProperty("submit-region")
    public String submitRegion;
    public String condition;
    public List<Argument> argument;
    @JsonProperty("re-render")
    public String reRender;
    @JsonProperty("client-side-language")
    public EnumsDecleration.Language clientSideLanguage;
    public String before;
    public String name;
    public String action;
    @JsonProperty("on-success")
    public String onSuccess;
    @JsonProperty("run-at")
    public EnumsDecleration.Environment runAt;
}
