package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2018/3/21.
 */
@Controller
@RequestMapping("/innocence")
public class InnocenceController {

  /*  @RequestMapping("/hello")

    public String sayHello(){
        UserInfo userInfo = new UserInfo();
        return "innocence";
    }*/
  @GetMapping("/addHtml")
  public String addhtml(){
      return "html/addHtml1";
  }
}
