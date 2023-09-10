package ra.springbansach.service.imbl;

import ra.springbansach.model.dto.reponse.CategoryResponseDto;
import ra.springbansach.model.dto.request.CategoryRequestDto;
import ra.springbansach.service.ICatagoryService;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICatagoryService {
    @Override
    public List<CategoryResponseDto> finAll() {
        return null;
    }

    @Override
    public CategoryResponseDto findById(Long id) {
        return null;
    }

    @Override
    public CategoryResponseDto save(CategoryRequestDto categoryRequestDto) {
        return null;
    }

    @Override
    public CategoryResponseDto update(CategoryRequestDto categoryRequestDto, Long id) {
        return null;
    }

    @Override
    public CategoryResponseDto delete(Long id) {
        return null;
    }
}
