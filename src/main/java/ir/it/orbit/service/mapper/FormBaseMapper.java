package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.FormBaseDTO;
import ir.it.orbit.service.xml.WidgetJson.FormBase;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {FormMapper.class})
public interface FormBaseMapper extends EntityMapper<FormBaseDTO, FormBase> {


}
