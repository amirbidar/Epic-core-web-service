package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.FormDTO;
import ir.it.orbit.service.xml.Base.Form;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface FormMapper extends EntityMapper<FormDTO, Form> {


}
