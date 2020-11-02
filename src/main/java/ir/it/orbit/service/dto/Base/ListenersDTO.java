package ir.it.orbit.service.dto.Base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Listeners {
    public List<PhaseListener> phaseListener;
}
