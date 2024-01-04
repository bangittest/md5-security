package com.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HandleException {
    @GetMapping("/403")
    public String getExceptionMessage(){
        return "403";
    }
}
