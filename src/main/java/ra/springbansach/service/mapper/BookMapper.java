package ra.springbansach.service.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.domain.Book;
import ra.springbansach.model.domain.Categorys;
import ra.springbansach.model.dto.reponse.BookResponseDto;
import ra.springbansach.model.dto.request.BookRequestDto;
import ra.springbansach.repository.IAuthorRepository;
import ra.springbansach.repository.ICategoryRepository;
import ra.springbansach.service.IGenericMapper;

import java.util.List;
import java.util.Optional;

@Component
public class BookMapper implements IGenericMapper<Book, BookRequestDto, BookResponseDto> {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Autowired
    private IAuthorRepository authorRepository;

    @Override
    public Book toEntity(BookRequestDto bookRequestDto) {
        Optional<Categorys> category = categoryRepository.findById(bookRequestDto.getCategory());
        List<Author> authorList = authorRepository.findAllById(bookRequestDto.getAuthorsList());
        return Book.builder().authors(authorList).name(bookRequestDto.getName()).category(category.get()).build();
    }

    @Override
    public BookResponseDto toResponse(Book book) {
        return BookResponseDto.builder().id(book.getId()).authorsList(book.getAuthors()).category(book.getCategory()).name(book.getName()).build();
    }
}
