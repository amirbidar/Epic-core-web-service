package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Tree.ColumnDTO;
import ir.it.orbit.service.xml.Attributes.Tree.Column;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ColumnMapper extends EntityMapper<ColumnDTO, Column> {


}
