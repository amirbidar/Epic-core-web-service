package ir.it.orbit.service.dto.Attributes.EditableTable;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.*;
import lombok.Data;

@Data
public class CellEditor {
    public TextFieldEditableTabel textfield;
    public TextAreaEditableTabel textarea;
    public PasswordFieldEditableTabel passwordField;
    public DatePickerEditableTabel datepicker;
    public DropDownEditableTable dropdown;
    public CheckBoxGroupEditableTable checkboxGroup;
    public CheckBoxEditableTable checkbox;
    public RadioEditableTable radio;


}
