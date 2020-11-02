package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.StaticListDTO;
import ir.it.orbit.service.xml.WidgetJson.StaticList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,BaseValidationMapper.class,ListenersMapper.class,ListItemsMapper.class,EventAllMapper.class,ConverterMapper.class})
public interface StaticListMapper extends EntityMapper<StaticListDTO, StaticList> {


}
