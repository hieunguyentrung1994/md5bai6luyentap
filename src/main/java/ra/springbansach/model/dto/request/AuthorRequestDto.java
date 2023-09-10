package ra.springbansach.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.springbansach.model.domain.Author;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorRequestDto {

    private String name;

    private Long zipCode;
}
