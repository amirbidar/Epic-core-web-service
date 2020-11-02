package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.GridLayoutDTO;
import ir.it.orbit.service.xml.Attributes.Form.GridLayout;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface GridLayoutMapper extends EntityMapper<GridLayoutDTO, GridLayout> {


}
