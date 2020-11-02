package ir.it.orbit.service.web.service.dto;

import lombok.Data;

@Data
public class Post {
    private Long id;
    private Long userId;
    private String title;
    private String body;
}
