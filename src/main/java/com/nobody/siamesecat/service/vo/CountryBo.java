package com.nobody.siamesecat.service.vo;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CountryBo {

    private String code;

    private String name;

    private String continent;

    private String region;

    private BigDecimal surfaceArea;

    private Integer indepYear;

    private Integer population;
}
