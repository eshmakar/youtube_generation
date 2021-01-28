package ru.eshmakar.youtube_generation.controller;

import ru.eshmakar.youtube_generation.Rand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Contr {
    @RequestMapping
    public String homePage() {
        return "index";
    }


    @GetMapping("random")
    public String randomList(Model model){
        for (int i = 0; i < 21; i++) {
            model.addAttribute("random" +i, new Rand().randd());
        }
        return "random";
    }




}