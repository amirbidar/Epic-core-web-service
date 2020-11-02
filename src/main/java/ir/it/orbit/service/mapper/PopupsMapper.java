package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.PopupsDTO;
import ir.it.orbit.service.xml.Base.Popups;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PopupMapper.class,})
public interface PopupsMapper extends EntityMapper<PopupsDTO, Popups> {


}
