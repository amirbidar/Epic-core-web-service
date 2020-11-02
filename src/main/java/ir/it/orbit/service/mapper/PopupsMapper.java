package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.CompositeDTO;
import ir.it.orbit.service.xml.WidgetJson.Composite;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface CompositeMapper extends EntityMapper<CompositeDTO, Composite> {


}
