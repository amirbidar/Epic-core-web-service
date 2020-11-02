package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.LayoutMapper;
import ir.it.orbit.service.dto.Base.FormDTO;
import ir.it.orbit.service.xml.Base.Form;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BaseValidationMapper.class, RefFormsMapper.class,EventAllMapper.class,RefFormMapper.class,ListenersMapper.class, LayoutMapper.class,ResourcesMapper.class})
public interface FormMapper extends EntityMapper<FormDTO, Form> {


}
