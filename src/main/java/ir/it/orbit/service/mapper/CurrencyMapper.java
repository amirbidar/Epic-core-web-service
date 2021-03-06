package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.CurrencyDTO;
import ir.it.orbit.service.xml.WidgetJson.Currency;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,LayoutDateMapper.class,EventAllMapper.class})
public interface CurrencyMapper extends EntityMapper<CurrencyDTO, Currency> {


}
