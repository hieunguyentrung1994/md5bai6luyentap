package ra.springbansach.service.imbl;

import org.springframework.beans.factory.annotation.Autowired;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.dto.reponse.AuthorResponseDto;
import ra.springbansach.model.dto.request.AuthorRequestDto;
import ra.springbansach.repository.IAuthorRepository;
import ra.springbansach.repository.IZipcodeRepository;
import ra.springbansach.service.IAuthorService;

import java.util.List;
import org.springframework.stereotype.Service;
import ra.springbansach.service.IZipcodeService;
import ra.springbansach.service.mapper.AuthorMapper;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
   private IAuthorRepository authorRepository;
    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private IZipcodeRepository zipcodeRepository;
    @Override
    public List<AuthorResponseDto> finAll() {
        return null;
    }

    @Override
    public AuthorResponseDto findById(Long id) {
        return null;
    }

    @Override
    public AuthorResponseDto save(AuthorRequestDto authorRequestDto) {
        return null;
    }

    @Override
    public AuthorResponseDto update(AuthorRequestDto authorRequestDto, Long id) {
        return null;
    }

    @Override
    public AuthorResponseDto delete(Long id) {
        return null;
    }

    @Override
    public AuthorResponseDto existsByZipcodeAndId(Long zipcode, Long id) {
       boolean check = authorRepository.existsByZipcodeAndId(zipcode, id);
        if (check) {
            return null;
        }
       Author author = authorRepository.findById(id).get();
        author.setZipcode(zipcodeRepository.findById(zipcode).get());
        authorRepository.save(author);
        return authorMapper.toResponse(author);
    }

    @Override
    public AuthorResponseDto removeZipcpdeId(Long id) {
        return null;
    }
}
