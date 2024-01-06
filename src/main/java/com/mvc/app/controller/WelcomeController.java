package com.mvc.app.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public ModelAndView getWelcomeMessage(){
       ModelAndView modelAndView = new ModelAndView() ;
       modelAndView.addObject( "msg","Welcome to Spring Boot MVC" );
       modelAndView.setViewName( "index" );
       return modelAndView;
    }


    @GetMapping("/greet")
    public ModelAndView getGreetMessage(){
        ModelAndView modelAndView = new ModelAndView() ;
        modelAndView.addObject( "msg","Good Morning !!!!!!!!" );
        modelAndView.setViewName( "index" );
        return modelAndView;
    }

}
