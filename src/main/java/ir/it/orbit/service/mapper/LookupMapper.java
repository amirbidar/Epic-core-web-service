package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.LookupDTO;
import ir.it.orbit.service.xml.WidgetJson.Lookup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, EntityEditableGridMapper.class, BaseValidationMapper.class,ConverterMapper.class, GridLayoutDataMapper.class, BasePaginationMapper.class,EventAllMapper.class})
public interface LookupMapper extends EntityMapper<LookupDTO, Lookup> {


}
