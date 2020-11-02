package ir.it.orbit.service.dto.Base.EventListeners;

import ir.it.orbit.service.dto.Base.ArgumentDTO;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

import java.util.List;

@Data
public class OnLoadDTO {
    public EnumsDecleration.EventPhase phase;
    public String fireCondition;
    public String submitRegion;
    public String condition;
    public List<ArgumentDTO> argument;
    public String reRender;
    public EnumsDecleration.Language clientSideLanguage;
    public String before;
    public String name;
    public String action;
    public String onSuccess;
    public EnumsDecleration.Environment runAt;
}
