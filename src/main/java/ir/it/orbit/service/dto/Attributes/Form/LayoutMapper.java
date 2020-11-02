package ir.it.orbit.service.dto.Attributes.Form;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import ir.it.orbit.service.mapper.EntityMapper;
import ir.it.orbit.service.mapper.GridLayoutMapper;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.Layout;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {GridLayoutMapper.class})
public interface LayoutMapper extends EntityMapper<LayoutDTO, Layout> {


}
