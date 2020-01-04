package com.test.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 */
@Controller
public class ProfileController {

    @GetMapping("/profile/{action}")
    public String  profile(@PathVariable(name = "action") String action,
                           Model model){
        if ("questions".equals(action))
        return "profile";
    }
}
