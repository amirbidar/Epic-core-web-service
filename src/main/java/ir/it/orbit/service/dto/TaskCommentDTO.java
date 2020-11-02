package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import lombok.Data;

@Data
public class TaskCommentDTO {
    public ListenersDTO listeners;
    public Boolean layoutable;
    public String validators;
    public BaseConverterDTO converter;
    public String tooltip;
    public Integer maxLength;
    public Boolean defaultWidget;
    public Boolean htmlEnabled;
    public String label;
    public Boolean enabled;
    public LayoutDataDTO layoutData;
    public Boolean readonly;
    public String name;
    public String value;
    public String events;
    public String direction;
}
