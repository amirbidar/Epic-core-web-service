package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.LayoutDataDTO;
import ir.it.orbit.service.xml.Base.LayoutData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {GridLayoutDataMapper.class})
public interface LayoutDateMapper extends EntityMapper<LayoutDataDTO, LayoutData> {


}
