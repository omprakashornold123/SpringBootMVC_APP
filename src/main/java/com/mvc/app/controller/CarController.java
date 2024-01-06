package com.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    //http://localhost:9090/webapp/car/101/hyd
    @GetMapping("/car/{carId}/hyd")
    public ModelAndView getColor(@PathVariable Integer carId) {
        ModelAndView modelAndView = new ModelAndView();
        String color = null;
        if (carId > 100) {
            color = "RED";
        } else {
            color = "BLACK";
        }
        modelAndView.addObject( "msg", "Car color is " + color );
        modelAndView.setViewName( "index" );
        return modelAndView;
    }

    //http://localhost:9090/webapp/stock/hyundai/location/hyderbad
    @GetMapping("/stock/{brand}/location/{loc}")
    public ModelAndView getCarStock(@PathVariable String brand, @PathVariable String loc) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject( "msg", "In " + loc + " " + brand + " cars are out of stock" );
        modelAndView.setViewName( "index" );
        return modelAndView;
    }

}
