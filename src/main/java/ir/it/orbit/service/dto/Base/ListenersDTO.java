package ir.it.orbit.service.dto.Base;

import lombok.Data;

import java.util.List;

@Data
public class ListenersDTO {
    public List<PhaseListenerDTO> phaseListener;
}
