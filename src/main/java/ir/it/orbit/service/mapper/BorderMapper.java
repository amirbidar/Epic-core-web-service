package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Composite.BorderDTO;
import ir.it.orbit.service.xml.Attributes.Composite.Border;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface BorderMapper extends EntityMapper<BorderDTO, Border> {


}
