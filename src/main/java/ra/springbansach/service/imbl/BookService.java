package ra.springbansach.service.imbl;

import ra.springbansach.model.dto.reponse.BookResponseDto;
import ra.springbansach.model.dto.request.BookRequestDto;
import ra.springbansach.service.IBookService;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Override
    public List<BookResponseDto> finAll() {
        return null;
    }

    @Override
    public BookResponseDto findById(Long id) {
        return null;
    }

    @Override
    public BookResponseDto save(BookRequestDto bookRequestDto) {
        return null;
    }

    @Override
    public BookResponseDto update(BookRequestDto bookRequestDto, Long id) {
        return null;
    }

    @Override
    public BookResponseDto delete(Long id) {
        return null;
    }
}
