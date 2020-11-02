package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.GridDTO;
import ir.it.orbit.service.xml.WidgetJson.Grid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class,BaseValidationMapper.class, LayoutDateMapper.class, BasePaginationMapper.class, EventAllMapper.class})
public interface GridMapper extends EntityMapper<GridDTO, Grid> {

}
