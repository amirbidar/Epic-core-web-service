package ir.it.orbit.service.dto.Attributes.EditableTable;

import ir.it.orbit.service.dto.Attributes.EditableTable.CellEditorComponents.*;
import lombok.Data;

@Data
public class CellEditorDTO {
    public TextFieldEditableTabelDTO textfield;
    public TextAreaEditableTabelDTO textarea;
    public PasswordFieldEditableTabelDTO passwordField;
    public DatePickerEditableTabelDTO datepicker;
    public DropDownEditableTableDTO dropdown;
    public CheckBoxGroupEditableTableDTO checkboxGroup;
    public CheckBoxEditableTableDTO checkbox;
    public RadioEditableTableDTO radio;


}
