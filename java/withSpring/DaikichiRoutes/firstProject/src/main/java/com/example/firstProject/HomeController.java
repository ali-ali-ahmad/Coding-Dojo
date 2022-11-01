package com.example.firstProject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/daikichi")
public class HomeController {
    @RequestMapping("")
    public String index(){
      return "Welcome";
    }
    @RequestMapping("/today")
    public String hello(){
      return "Today you will find fuck in all your endeavors";
    }
    @RequestMapping("/tomorrow")
    public String world(){
      return "Tomorrow, as an opportunity will arise, so be sure to be open to new ideas";
    }
}
