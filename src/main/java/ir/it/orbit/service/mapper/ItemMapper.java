package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.ItemsDTO;
import ir.it.orbit.service.xml.Attributes.EditableTable.CellEditorComponents.Items;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ItemMapper extends EntityMapper<ItemsDTO, Items> {



}
