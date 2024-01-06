package com.mvc.app.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    // http://localhost:9090/msg?name=omprakash
    @GetMapping("/msg")
    public ModelAndView greet(@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView();
        String msgTxt = name + " Good Morning !!!!";
        modelAndView.addObject( "msg", msgTxt );
        modelAndView.setViewName( "index" );
        return modelAndView;
    }

    //http://localhost:9090/msg?name=java&author=james gosiling
    @GetMapping("/book")
    public ModelAndView getBookDetails(@RequestParam String name ,String author){
        System.out.println("Name :: "+name);
        System.out.println("Author :: "+ author );
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject( "msg",name+" by author "+author +" is out of stock" );
        modelAndView.setViewName( "index" );
        return modelAndView;
    }
}
