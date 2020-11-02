package ir.it.orbit.service.dto.Base.EventListeners;

import ir.it.orbit.service.dto.Base.ArgumentDTO;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

import java.util.List;

@Data
public class OnFirstDTO {
    public String submitRegion;
    public List<ArgumentDTO> argument;
    public String reRender;
    public String before;
    public String name;
    public String action;
    public String onSuccess;
    public EnumsDecleration.EventPhase phase;
    public EnumsDecleration.Language clientSideLanguage;
    public EnumsDecleration.Environment runAt;
    public String fireCondition;
    public String condition;


}
