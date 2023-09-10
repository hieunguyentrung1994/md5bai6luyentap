package ra.springbansach.model.dto.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.domain.Book;
import ra.springbansach.model.domain.ZipCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AuthorResponseDto {

    private Long id;
    private String name;

    private Long zipcode;

}
