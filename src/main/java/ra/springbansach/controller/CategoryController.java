package ra.springbansach.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.springbansach.model.dto.reponse.CategoryResponseDto;
import ra.springbansach.model.dto.request.CategoryRequestDto;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @PostMapping("/add")
    public ResponseEntity<CategoryResponseDto> addCategory(
            @RequestBody CategoryRequestDto categoryRequestDto) {

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CategoryResponseDto> getCategory(@PathVariable  Long id) {

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CategoryResponseDto>> getCategories() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CategoryResponseDto> deleteCategory(@PathVariable  Long id) {

    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<CategoryResponseDto> editCategory(
                                                            @RequestBody  CategoryRequestDto categoryRequestDto,
                                                            @PathVariable  Long id) {

    }
}
