package com.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class DemoController {

    @GetMapping("/today_date")
    public ModelAndView getTodayDate() {

        ModelAndView modelAndView = new ModelAndView();
        LocalDate now = LocalDate.now();
        String msgText = "Today's Date is " + now;
        modelAndView.addObject( "msg", msgText );
        modelAndView.setViewName( "index" );
        return modelAndView;
    }
}
