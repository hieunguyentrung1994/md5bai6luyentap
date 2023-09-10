package ra.springbansach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.springbansach.model.dto.reponse.AuthorResponseDto;
import ra.springbansach.model.dto.request.AuthorRequestDto;
import ra.springbansach.service.IAuthorService;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private IAuthorService authorService;
    @PostMapping("/addAuthor")
    public ResponseEntity<AuthorResponseDto> addAuthor(@RequestBody AuthorRequestDto authorRequestDto) {
        AuthorResponseDto authorResponseDto = authorService.save(authorRequestDto);
return new ResponseEntity<>(authorResponseDto, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AuthorResponseDto> getAuthor(@PathVariable  Long id) {
        return new ResponseEntity<>(authorService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<AuthorResponseDto>> getAuthors() {
return new ResponseEntity<>(authorService.finAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AuthorResponseDto> deleteAuthor(@PathVariable  Long id) {
return new ResponseEntity<>(authorService.delete(id),HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    private ResponseEntity<AuthorResponseDto> editAuthor(@PathVariable  Long id,
                                                         @RequestBody  AuthorRequestDto authorRequestDto) {
        return new ResponseEntity<>(authorService.update(authorRequestDto,id),HttpStatus.OK);
    }

    @PatchMapping("/addZipcode/{zipcodeId}/to/{authorId}")
    private ResponseEntity<AuthorResponseDto> addZipcode(@PathVariable Long zipcodeId,
                                                         @PathVariable Long authorId) {
        AuthorResponseDto author = authorService.existsByZipcodeAndId(zipcodeId, authorId);
        if (author == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(author, HttpStatus.OK);
    }


    @DeleteMapping("/removeZipcode/{id}")
    private ResponseEntity<AuthorResponseDto> removeZipcode(@PathVariable  Long id) {
        AuthorResponseDto a = authorService.removeZipcpdeId(id);
        if (a == null) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(a, HttpStatus.NOT_FOUND);
    }
}
