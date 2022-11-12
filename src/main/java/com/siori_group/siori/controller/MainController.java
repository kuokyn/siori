package com.siori_group.siori.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/company")
    public String company() {
        return "profileCompany";
    }


    @GetMapping("/employers")
    public String employers() {
        return "employersCommonList";
    }

    @GetMapping("/clients")
    public String clients() {
        return "clientsCommonList";
    }

    @GetMapping("/enrollees")
    public String enrollees() {
        return "forEnrollees";
    }

    @GetMapping("/students")
    public String students() {
        return "forStudents";
    }

    @GetMapping("/universities")
    public String universities() {
        return "universitiesCommonList";
    }
}
