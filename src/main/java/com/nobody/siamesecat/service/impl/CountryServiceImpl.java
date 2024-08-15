package com.nobody.siamesecat.service.impl;

import com.nobody.siamesecat.model.vo.CountryPo;
import com.nobody.siamesecat.service.vo.CountryBo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobody.siamesecat.model.repository.CountryRepository;
import com.nobody.siamesecat.service.CountryService;

import java.util.Optional;

@Log4j2
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public CountryBo findCountryByCode(String code) {
        log.info("findCountryByCode");
        Optional<CountryPo> findById = countryRepository.findById(code);
        CountryPo countryPo = findById.orElse(new CountryPo());
        return CountryBo.builder()
                .code(countryPo.getCode())
                .name(countryPo.getName())
                .region(countryPo.getRegion())
                .continent(countryPo.getContinent())
                .build();
    }
}
