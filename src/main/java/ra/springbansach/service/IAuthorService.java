package ra.springbansach.service;

import ra.springbansach.model.dto.reponse.AuthorResponseDto;
import ra.springbansach.model.dto.request.AuthorRequestDto;

public interface IAuthorService extends IGenericService<AuthorResponseDto, AuthorRequestDto,Long> {
   AuthorResponseDto existsByZipcodeAndId(Long zipcode, Long id);
    AuthorResponseDto  removeZipcpdeId(Long id);
}
