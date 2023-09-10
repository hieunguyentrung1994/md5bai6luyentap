package ra.springbansach.service.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.domain.ZipCode;
import ra.springbansach.model.dto.reponse.AuthorResponseDto;
import ra.springbansach.model.dto.request.AuthorRequestDto;
import ra.springbansach.repository.IAuthorRepository;
import ra.springbansach.repository.IZipcodeRepository;
import ra.springbansach.service.IGenericMapper;

import java.util.Optional;

@Component
public class AuthorMapper implements IGenericMapper<Author, AuthorRequestDto, AuthorResponseDto> {
@Autowired
private IZipcodeRepository zipcodeRepository;
    @Override
    public Author toEntity(AuthorRequestDto authorRequestDto) {
        Optional<ZipCode> zipCode = zipcodeRepository.findById(authorRequestDto.getZipCode());
        return Author.builder().zipcode(zipCode.get()).name(authorRequestDto.getName()).build();
    }

    @Override
    public AuthorResponseDto toResponse(Author author) {
        return AuthorResponseDto.builder().id(author.getId()).zipcode(author.getZipcode().getId()).name(author.getName()).build();
    }
}
