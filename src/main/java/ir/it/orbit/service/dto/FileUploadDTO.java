package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.Upload.DataUpload;
import ir.it.orbit.service.dto.Base.*;
import ir.it.orbit.service.dto.Enum.EnumsDecleration;
import lombok.Data;

@Data
public class FileUploadDTO {
    public String factory;
    public String metadata;
    public Integer maximumFile;
    public Listeners listeners;
    public DataUpload data;
    public String validExtension;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public Boolean manualSubmit;
    public EnumsDecleration.SourceUpload source;
    public String label;
    public Boolean enabled;
    public String fileManager;
    public LayoutData layoutData;
    public Boolean readonly;
    public EnumsDecleration.RepositoryTypeUpload repositoryType;
    public String name;
    public String value;
    public Integer maximumSize;
    public EventAll events;
}
