package com.zgw.notebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NotebokController {

    @GetMapping("/list")
    public String showUpdateForm(Model model)
    {
        return "index";
    }
}
