package ir.it.orbit.service.dto.Base;

import lombok.Data;

@Data
public
class GridLayoutDataDTO {
    public Boolean hGrab;
    public Integer colSpan;
    public Boolean vGrab;
    public Integer rowSpan;
    public Integer vHint;
    public Integer hHint;
    public String vAlignment;
    public String hAlignment;

}
