package ra.springbansach.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.domain.Categorys;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequestDto {
    private String name;

    private Long category;

    private List<Long> authorsList;
}
