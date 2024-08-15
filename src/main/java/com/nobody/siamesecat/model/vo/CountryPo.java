package com.nobody.siamesecat.model.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "country")
public class CountryPo {

    @Id
    private String code;

    private String name;

    private String continent;

    private String region;
    @Column(name = "surfacearea")
    private BigDecimal surfaceArea;
    @Column(name = "indepyear")
    private Integer indepYear;

    private Integer population;
    @Column(name = "lifeexpectancy")
    private BigDecimal lifeExpectancy;

    private BigDecimal gnp;

    @Column(name = "gnpold")
    private BigDecimal gnpOld;
    @Column(name = "localname")
    private String localName;
    @Column(name = "governmentform")
    private String governmentForm;

    @Column(name = "headofstate")
    private String headOfState;

    private Integer capital;

    private String code2;

}
