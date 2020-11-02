package ir.it.orbit.service.mapper;

import ir.it.orbit.service.dto.Base.ChildrenDTO;
import ir.it.orbit.service.xml.Base.Children;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {FormMapper.class,ButtonMapper.class,CaptchaMapper.class,CheckBoxGroupMapper.class,CheckBoxItemMapper.class,CompositeMapper.class,CurrencyMapper.class,DatePickerMapper.class,DropDownMapper.class,DynamicCheckBoxMapper.class,DynamicComboBoxMapper.class,DynamicWidgetMapper.class,EditableGridMapper.class,FileUploadMapper.class,FrameMapper.class,GridMapper.class,ImageMapper.class,LabelMapper.class,LinkMapper.class,LookupMapper.class,PasswordFieldMapper.class,RadioGroupMapper.class,RadioItemMapper.class,StaticComboBoxMapper.class,StaticListMapper.class,TabFolderMapper.class,TaskCommentMapper.class,TextAreaMapper.class,TextFieldMapper.class,TransitionComboMapper.class,TreeMapper.class})
public interface ChildrenMapper extends EntityMapper<ChildrenDTO, Children> {


}
