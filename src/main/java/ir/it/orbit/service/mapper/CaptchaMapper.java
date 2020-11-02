package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.CaptchaDTO;
import ir.it.orbit.service.xml.WidgetJson.Captcha;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LayoutDateMapper.class,BaseValidationMapper.class})
public interface CaptchaMapper extends EntityMapper<CaptchaDTO, Captcha> {


}
