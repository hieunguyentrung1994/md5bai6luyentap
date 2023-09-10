package ra.springbansach.service.imbl;

import org.springframework.stereotype.Service;
import ra.springbansach.model.domain.City;
import ra.springbansach.model.dto.request.CityRequestDto;
import ra.springbansach.service.ICityService;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Override
    public List<City> finAll() {
        return null;
    }

    @Override
    public City findById(Long id) {
        return null;
    }

    @Override
    public City save(CityRequestDto cityRequestDto) {
        return null;
    }

    @Override
    public City update(CityRequestDto cityRequestDto, Long id) {
        return null;
    }

    @Override
    public City delete(Long id) {
        return null;
    }
}
