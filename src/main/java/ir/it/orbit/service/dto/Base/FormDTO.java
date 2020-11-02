package ir.it.orbit.service.dto.Base;


import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.Layout;
import lombok.Data;

@Data
public class FormDTO {

    public String clientSideLanguage;
    public BaseValidation validators;
    public String title;
    public Boolean enabled;
    public String xmlnsXsd;
    public String xmlns;
    public Boolean draggable;
    public Children children;
    public String xPosition;
    public EventAll events;
    public String height;
    public Boolean visible;
    public RefForms refForms;
    public Listeners listeners;
    public Boolean resizable;
    public Boolean layoutable;
    public Popups popups;
    public Resources resources;
    public String label;
    public String yPosition;
    public Integer version;
    public Layout layout;
    public Boolean rendered;
    public String name;
    public String width;
}
