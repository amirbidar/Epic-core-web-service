package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.ResourcesDTO;
import ir.it.orbit.service.xml.Base.Resources;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {GlossaryMapper.class})
public interface ResourcesMapper extends EntityMapper<ResourcesDTO, Resources> {


}
