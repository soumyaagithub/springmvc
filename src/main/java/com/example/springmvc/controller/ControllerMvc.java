package com.example.springmvc.controller;

import com.example.springmvc.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMvc {
    @GetMapping("/")
    public String examplDemo(@RequestParam(value="name",defaultValue = "World!!",required = true)String name1, Model model){
        model.addAttribute("name2",name1);

        return "home";
    }
    @GetMapping("/greeting")
    public String greetingPage(Model model, Greeting greeting){
        model.addAttribute("greeting1",new Greeting());
        return "greeting";

    }
    @PostMapping("/greeting")
    public String resultPage(@ModelAttribute Greeting greeting1,Model model){
        model.addAttribute("greeting2",greeting1);
        return "result";

    }
}
