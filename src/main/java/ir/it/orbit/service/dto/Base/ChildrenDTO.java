package ir.it.orbit.service.dto.Base;


import ir.it.orbit.service.dto.Attributes.Composite.Hidden;
import ir.it.orbit.service.dto.*;
import lombok.Data;

import java.util.List;

@Data
public class ChildrenDTO {
    public List<FormDTO> form;
    public List<ButtonDTO> button;
    public List<CaptchaDTO> captcha;
    public List<CheckBoxGroupDTO> checkBoxGroup;
    public List<CompositeDTO> composite;
    public List<CheckBoxItemDTO> checkBoxItem;
    public List<CurrencyDTO> currency;
    public List<DatePickerDTO> datePicker;
    public List<DynamicComboBoxDTO> dropdown;
    public List<DynamicWidgetDTO> dynamicWidget;
    public List<EditableGridDTO> editableGrid;
    public List<FileUploadDTO> fileUpload;
    public List<FrameDTO> frame;
    public List<GridDTO> grid;
    public List<ImageDTO> image;
    public List<LabelDTO> label;
    public List<LinkDTO> link;
    public List<LookupDTO> lookup;
    public List<PasswordFieldDTO> passwordField;
    public List<RadioGroupDTO> radioGroup;
    public List<RadioItemDTO> radioItem;
    public List<StaticListDTO> list;
    public List<TabFolderDTO> tabFolder;
    //public TaskComment taskComment;
    public List<TextareaDTO> textArea;
    public List<TextFieldDTO> textField;
  //  public TransitionCombo transitionCombo;
    public List<TreeDTO> tree;
    public List<Hidden> hidden;

// TODO: 10/28/2020 write all widgets

}
