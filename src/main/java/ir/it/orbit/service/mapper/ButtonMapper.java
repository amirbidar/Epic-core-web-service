package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.ButtonDTO;
import ir.it.orbit.service.xml.WidgetJson.Button;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,LayoutDateMapper.class,EventAllMapper.class})
public interface ButtonMapper extends EntityMapper<ButtonDTO, Button> {


}
