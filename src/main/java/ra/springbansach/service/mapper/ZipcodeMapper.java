package ra.springbansach.service.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ra.springbansach.model.domain.City;
import ra.springbansach.model.domain.ZipCode;
import ra.springbansach.model.dto.request.ZipcodeRequestDto;
import ra.springbansach.repository.ICityRebository;
import ra.springbansach.repository.IZipcodeRepository;
import ra.springbansach.service.IGenericMapper;

import java.util.Optional;

@Component
public class ZipcodeMapper implements IGenericMapper<ZipCode, ZipcodeRequestDto,ZipCode> {
    @Autowired
    private ICityRebository cityRebository;
    @Override
    public ZipCode toEntity(ZipcodeRequestDto zipcodeRequestDto) {
        Optional<City> city = cityRebository.findById(zipcodeRequestDto.getCity_id());
        return ZipCode.builder().name(zipcodeRequestDto.getName()).city(city.get()).build();
    }

    @Override
    public ZipCode toResponse(ZipCode zipCode) {
        return zipCode;
    }
}
