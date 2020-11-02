package ir.it.orbit.service.dto.Base;

import lombok.Data;

@Data
public class BasePaginationDTO {
    public String numberOfPages;
    public String pageNumber;
    public String text;
}
