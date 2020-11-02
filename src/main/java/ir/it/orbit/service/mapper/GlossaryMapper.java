package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Attributes.Form.GlossaryDTO;
import ir.it.orbit.service.xml.Attributes.Form.Glossary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface GlossaryMapper extends EntityMapper<GlossaryDTO, Glossary> {



}
