package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.EventAllDTO;
import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.dto.ImageDTO;
import ir.it.orbit.service.xml.WidgetJson.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class, EventAllMapper.class})
public interface ImageMapper extends EntityMapper<ImageDTO, Image> {


}
