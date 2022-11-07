package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping(value = "/hi")
    public String MustacheCon(Model model){
        model.addAttribute("username", "sangjoon"); // view에 값을 넘김
        return "greetings"; // greetings라는 이름의 view를 리턴
    }

    @GetMapping(value = "/hi/{id}")
    public String MustacheCon2(@PathVariable String id, Model model){
        model.addAttribute("username", "sangjoon");
        model.addAttribute("id", id);경
        return "greetings";
    }

}
