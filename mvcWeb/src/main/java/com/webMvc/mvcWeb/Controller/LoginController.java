package com.webMvc.mvcWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/home")
    public String home(Model model){
       model.addAttribute("name", "Sohail");
       model.addAttribute("lastName", "Shaikh");
        return "login";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

}
