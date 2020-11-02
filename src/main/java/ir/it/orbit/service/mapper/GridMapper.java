package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.GridDTO;
import ir.it.orbit.service.xml.WidgetJson.Grid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface GridMapper extends EntityMapper<GridDTO, Grid> {


}
