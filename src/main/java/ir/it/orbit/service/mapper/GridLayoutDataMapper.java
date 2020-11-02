package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.GridLayoutDataDTO;
import ir.it.orbit.service.xml.Base.GridLayoutData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface GridLayoutDataMapper extends EntityMapper<GridLayoutDataDTO, GridLayoutData> {


}
