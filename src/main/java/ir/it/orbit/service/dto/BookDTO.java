package ir.it.orbit.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Data
public class BookDTO implements Serializable {

    private Long id;
    private String name;
    private String author;
    private BigDecimal price;


    public BookDTO name(String name) {
        this.name = name;
        return this;
    }

    public BookDTO author(String author) {
        this.author = author;
        return this;
    }

    public BookDTO price(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BookDTO bookDTO = (BookDTO) o;
        if (bookDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), bookDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
