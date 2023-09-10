package ra.springbansach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.springbansach.model.domain.Categorys;
@Repository
public interface ICategoryRepository extends JpaRepository<Categorys,Long> {
}
