package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.ArgumentDTO;
import ir.it.orbit.service.dto.Base.GridLayoutDataDTO;
import ir.it.orbit.service.xml.Base.Argument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {GridLayoutDataMapper.class})
public interface BasePaginationMapper extends EntityMapper<ArgumentDTO, Argument> {

}
