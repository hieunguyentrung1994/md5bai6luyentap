package ra.springbansach.service.mapper;

import org.springframework.stereotype.Component;
import ra.springbansach.model.domain.Categorys;
import ra.springbansach.model.dto.reponse.CategoryResponseDto;
import ra.springbansach.model.dto.request.CategoryRequestDto;
import ra.springbansach.service.IGenericMapper;
@Component
public class CategoryMapper implements IGenericMapper<Categorys, CategoryRequestDto, CategoryResponseDto> {
    @Override
    public Categorys toEntity(CategoryRequestDto categoryRequestDto) {
        return Categorys.builder().name(categoryRequestDto.getName()).build();
    }

    @Override
    public CategoryResponseDto toResponse(Categorys categorys) {
        return CategoryResponseDto.builder().id(categorys.getId()).name(categorys.getName()).build();
    }
}
