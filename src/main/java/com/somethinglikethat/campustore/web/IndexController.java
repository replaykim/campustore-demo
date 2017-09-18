package com.somethinglikethat.campustore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/category")
    public String category(){
        return "category";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/details")
    public String details(){
        return "details";
    }
}
