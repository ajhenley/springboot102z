package com.byaj.springboot102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("myvar", "Say Something to the people");
        model.addAttribute("var2", 45);
        return "hometemplate";
    }
}
