package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Tree.ColumnsDTO;
import ir.it.orbit.service.xml.Attributes.Tree.Columns;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ColumnMapper.class})
public interface ColumnsMapper extends EntityMapper<ColumnsDTO, Columns> {


}
