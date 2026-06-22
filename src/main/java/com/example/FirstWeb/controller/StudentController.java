package com.example.FirstWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FirstWeb.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/info")
    public String info(Model model) {
        Student student = new Student("Tạ Gia Bảo", 20, "Công nghệ thông tin");
        model.addAttribute("student", student);
        return "student/info";
    }
}
