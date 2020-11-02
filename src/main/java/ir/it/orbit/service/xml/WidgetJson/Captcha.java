package ir.it.orbit.service.xml.WidgetJson;


import com.fasterxml.jackson.annotation.JsonProperty;
import ir.it.orbit.service.xml.Base.BaseValidation;
import ir.it.orbit.service.xml.Base.LayoutData;
import lombok.Data;

@Data
public class Captcha {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public BaseValidation validators;
    public String name;
    public String label;
    public Boolean enabled;
}
