package com.siori_group.siori.controller;

import com.siori_group.siori.entity.Company;
import com.siori_group.siori.entity.Course;
import com.siori_group.siori.entity.User;
import com.siori_group.siori.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.data.domain.Pageable;


@Controller
public class CompanyController {

    final CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/company")
    public String company() {
        return "profileCompany";
    }
    @GetMapping("/registrationAsCompany")
    public String registrationAsCompany(Model model) {
        model.addAttribute("companyForm", new Company());
        return "registration_as_company";
    }

    @PostMapping("/registrationAsCompany")
    public String registrationAsCompany(@ModelAttribute("companyForm") Company companyForm) {
        companyRepository.save(companyForm);
        return "index";
    }
    @GetMapping("/loginAsCompany")
    public String loginAsCompany() {
        return "login_as_company";
    }

    @GetMapping(value = "/companies")
    public String showCompany(Model model, Pageable pageable) {
        Page<Company> page;
        page = companyRepository.findAll(pageable);
        model.addAttribute("companyListPage", page);
        return "companiesCommonList";
    }

    @GetMapping("/company/clients")
    public String showCompanyClients(Model model) {
        return "companyUniversity";
    }

    @GetMapping("/company/courses")
    public String showCompanyCourses(Model model) {
        return "companyCourses";
    }

}
