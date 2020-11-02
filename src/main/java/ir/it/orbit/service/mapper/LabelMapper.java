package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.Base.ListenersDTO;
import ir.it.orbit.service.dto.LabelDTO;
import ir.it.orbit.service.xml.WidgetJson.Label;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EventAllMapper.class, ListenersMapper.class, LayoutDateMapper.class})
public interface LabelMapper extends EntityMapper<LabelDTO, Label> {


}
