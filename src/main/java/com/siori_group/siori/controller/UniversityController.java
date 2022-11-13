package com.siori_group.siori.controller;

import com.siori_group.siori.entity.Company;
import com.siori_group.siori.entity.University;
import com.siori_group.siori.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UniversityController {

    @Autowired
    UniversityRepository universityRepository;

    @GetMapping(value = "/universities")
    public String showCompany(Model model, Pageable pageable) {
        Page<University> page;
        page = universityRepository.findAll(pageable);
        model.addAttribute("universityListPage", page);
        return "universitiesCommonList";
    }

}
