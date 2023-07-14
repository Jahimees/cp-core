package com.example.cpcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkSpaceController {

    @GetMapping("/work-space")
    public String openWorkSpace() {
        return "work_space";
    }
}
