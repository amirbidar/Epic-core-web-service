package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.dto.Base.PopupDTO;
import ir.it.orbit.service.xml.WidgetJson.EditableGrid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutMapper.class,ChildrenMapper.class,EventAllMapper.class,ListenersMapper.class})
public interface PopupMapper extends EntityMapper<PopupDTO, EditableGrid> {


}
