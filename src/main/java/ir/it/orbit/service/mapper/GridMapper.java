package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.BasePaginationDTO;
import ir.it.orbit.service.dto.GridDTO;
import ir.it.orbit.service.xml.Base.EventAll;
import ir.it.orbit.service.xml.WidgetJson.Grid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, BaseValidationMapper.class,BaseValidationMapper.class, LayoutDateMapper.class, BasePaginationMapper.class, EventAll.class})
public interface GridMapper extends EntityMapper<GridDTO, Grid> {

}
