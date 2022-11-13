package com.siori_group.siori.controller;

import com.siori_group.siori.entity.Course;
import com.siori_group.siori.repository.CourseRepository;
import com.siori_group.siori.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public String showCourses(Model model, Pageable pageable) {
        Page<Course> page;
        page = courseRepository.findAll(pageable);
//        return page;
        model.addAttribute("courseListPage", page);
        return "courseCommonList";
    }
}
