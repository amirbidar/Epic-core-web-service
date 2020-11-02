package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.FileUploadDTO;
import ir.it.orbit.service.xml.WidgetJson.FileUpload;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface FileUploadMapper extends EntityMapper<FileUploadDTO, FileUpload> {


}
