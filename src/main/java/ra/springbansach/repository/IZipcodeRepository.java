package ra.springbansach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.springbansach.model.domain.ZipCode;
@Repository
public interface IZipcodeRepository extends JpaRepository<ZipCode,Long> {
}
