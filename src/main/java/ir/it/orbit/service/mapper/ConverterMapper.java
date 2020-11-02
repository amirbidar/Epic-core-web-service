package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.BaseConverterDTO;
import ir.it.orbit.service.xml.Base.BaseConverter;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ConverterMapper extends EntityMapper<BaseConverterDTO, BaseConverter> {

}
