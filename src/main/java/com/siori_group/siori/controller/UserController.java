package com.siori_group.siori.controller;


import com.siori_group.siori.entity.User;
import com.siori_group.siori.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/registrationAsStudent")
    public String registrationAsStudent(Model model) {
        model.addAttribute("userForm", new User());
        return "registration_as_student";
    }

    @PostMapping("/registrationAsStudent")
    public String registrationAsStudent(@ModelAttribute("userForm") User userForm) {
        userRepository.save(userForm);
        return "index";
    }

    @GetMapping("/loginAsStudent")
    public String loginAsStudent() {
        return "login_as_student";
    }


    @PostMapping("/loginAsStudent")
    public String loginAsStudent(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");
        return "index";
    }

    @GetMapping("/profile")
    public String showUserProfile(Model model) {
        return "profileUser";
    }

    @GetMapping("/profile/clients")
    public String showUserClients(Model model) {
        return "profileUserUniversity";
    }

    @GetMapping("/profile/courses")
    public String showUserCourses(Model model) {
        return "profileUserCourses";
    }
}
