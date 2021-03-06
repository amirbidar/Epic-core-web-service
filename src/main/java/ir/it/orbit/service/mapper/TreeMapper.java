package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.TreeDTO;
import ir.it.orbit.service.xml.WidgetJson.Tree;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class, ColumnsMapper.class,LayoutDateMapper.class,EventAllMapper.class})
public interface TreeMapper extends EntityMapper<TreeDTO, Tree> {


}
