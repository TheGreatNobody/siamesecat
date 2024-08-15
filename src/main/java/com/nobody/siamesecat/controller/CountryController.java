package com.nobody.siamesecat.controller;

import com.nobody.siamesecat.model.repository.CountryRepository;
import com.nobody.siamesecat.model.vo.CountryPo;
import com.nobody.siamesecat.service.CountryService;
import com.nobody.siamesecat.service.vo.CountryBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public String getCountry(Model model, @PathVariable("code") String code) {

        CountryBo countryBo = countryService.findCountryByCode(code);
        model.addAttribute("tutorial", countryBo);

        return "tutorials";
    }
}
