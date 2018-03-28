package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2018/3/20.
 */
@Controller
@EnableAutoConfiguration

public class MyController {

    @GetMapping("/hello")
    public ModelAndView seyHello() {
        return new ModelAndView("/hello");
    }
}
