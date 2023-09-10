package ra.springbansach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.springbansach.model.domain.Author;
import ra.springbansach.model.domain.ZipCode;
@Repository
public interface IAuthorRepository extends JpaRepository<Author,Long> {
    boolean existsByZipcodeAndId(Long zipcode, Long id);

    void removeByZipcodeAndId(ZipCode zipcode);
}
