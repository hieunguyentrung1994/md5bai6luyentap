package ra.springbansach.service.mapper;

import org.springframework.stereotype.Component;
import ra.springbansach.model.domain.City;
import ra.springbansach.model.dto.request.CityRequestDto;
import ra.springbansach.service.IGenericMapper;
@Component
public class CityMapper implements IGenericMapper<City, CityRequestDto,City> {
    @Override
    public City toEntity(CityRequestDto cityRequestDto) {
        return City.builder().name(cityRequestDto.getName()).build();
    }

    @Override
    public City toResponse(City city) {
        return city;
    }
}
