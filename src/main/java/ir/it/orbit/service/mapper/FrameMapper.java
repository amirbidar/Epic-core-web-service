package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.FrameDTO;
import ir.it.orbit.service.xml.WidgetJson.Frame;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,EventAllMapper.class})
public interface FrameMapper extends EntityMapper<FrameDTO, Frame> {

}
