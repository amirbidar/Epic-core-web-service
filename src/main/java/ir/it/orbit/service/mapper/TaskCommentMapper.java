package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.TaskCommentDTO;
import ir.it.orbit.service.xml.WidgetJson.TaskComment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListenersMapper.class,ConverterMapper.class,LayoutDateMapper.class})
public interface TaskCommentMapper extends EntityMapper<TaskCommentDTO, TaskComment> {


}
