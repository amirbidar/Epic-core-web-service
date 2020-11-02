package ir.it.orbit.service.dto;

import ir.it.orbit.service.dto.Attributes.EditableTable.ColumnsEditableTable;
import ir.it.orbit.service.dto.Attributes.EditableTable.DataEditableTable;
import ir.it.orbit.service.dto.Base.*;
import lombok.Data;

@Data
public class EditableGridDTO {
    public String factory;
    public Listeners listeners;
    public DataEditableTable data;
    public String deleteExpression;
    public Boolean layoutable;
    public BaseValidation validators;
    public ColumnsEditableTable columns;
    public BaseConverter converter;
    public String  findExpression;
    public String label;
    public Boolean showSideButtons;
    public Boolean enabled;
    public Boolean showAddButton;
    public LayoutData layoutData;
    public Integer maximumRows;
    public Boolean showDeleteButton;
    public String name;
    public String value;
    public String selectionMode;
    public EventAll events;
}
