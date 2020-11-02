package ir.it.orbit.service.dto.Base;


import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.LayoutDTO;
import lombok.Data;

@Data
public class FormDTO {

    public String clientSideLanguage;
    public BaseValidationDTO validators;
    public String title;
    public Boolean enabled;
    public String xmlnsXsd;
    public String xmlns;
    public Boolean draggable;
    public ChildrenDTO children;
    public String xPosition;
    public EventAllDTO events;
    public String height;
    public Boolean visible;
    public RefFormsDTO refForms;
    public ListenersDTO listeners;
    public Boolean resizable;
    public Boolean layoutable;
    public PopupsDTO popups;
    public ResourcesDTO resources;
    public String label;
    public String yPosition;
    public Integer version;
    public LayoutDTO layout;
    public Boolean rendered;
    public String name;
    public String width;
}
