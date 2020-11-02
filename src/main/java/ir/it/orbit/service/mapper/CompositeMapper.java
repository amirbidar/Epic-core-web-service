package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.dto.CompositeDTO;
import ir.it.orbit.service.xml.WidgetJson.Composite;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutMapper.class,LayoutDateMapper.class,ListenersMapper.class,ChildrenMapper.class,EventAllMapper.class,BorderMapper.class})
public interface CompositeMapper extends EntityMapper<CompositeDTO, Composite> {


}
