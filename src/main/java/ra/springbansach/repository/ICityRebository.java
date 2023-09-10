package ra.springbansach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.springbansach.model.domain.City;
@Repository
public interface ICityRebository extends JpaRepository<City,Long> {
}
