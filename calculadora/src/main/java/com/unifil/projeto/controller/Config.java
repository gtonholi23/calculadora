package com.unifil.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Config {

    @GetMapping("/hello")
    public String hello() {
     return "Eu sou muito burro";
    }


    @GetMapping("/calculator")
    public ModelAndView calculator(){
        ModelAndView mv = new ModelAndView("calculator");
        return mv;
    }
}
