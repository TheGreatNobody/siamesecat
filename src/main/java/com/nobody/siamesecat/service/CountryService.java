package com.nobody.siamesecat.service;

import com.nobody.siamesecat.service.vo.CountryBo;

public interface CountryService {

    CountryBo findCountryByCode(String code);
}
