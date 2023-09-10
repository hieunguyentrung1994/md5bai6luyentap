package ra.springbansach.model.dto.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.domain.Categorys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponseDto {
    private Long id;

    private String name;

    private Categorys category;

    private List<Author> authorsList = new ArrayList<>();
}
