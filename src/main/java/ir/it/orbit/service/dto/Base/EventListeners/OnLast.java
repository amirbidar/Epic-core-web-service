package ir.it.orbit.service.dto.Base.EventListeners;

import ir.it.orbit.service.dto.Base.Argument;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class OnLast {
    public EnumsDecleration.EventPhase phase;
    public String submitRegion;
    public List<Argument> argument;
    public String reRender;
    public EnumsDecleration.Language clientSideLanguage;
    public String before;
    public String name;
    public String action;
    public String onSuccess;
    public EnumsDecleration.Environment runAt;
    public String fireCondition;
    public String condition;
}
