package com.example.FirstWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/detail/{id}")
    @ResponseBody
    public String detail(@PathVariable(required = false) Long id) {
        if (id == null || id <= 0) {
            return "Lỗi: Product ID không hợp lệ!";
        }
        return "Product ID = " + id;
    }

    @GetMapping("/category")
    @ResponseBody
    public String category(@RequestParam(required = false) String name) {
        if (name == null || name.isBlank()) {
            return "Lỗi: Category name không hợp lệ!";
        }
        return "Category = " + name;
    }
}
