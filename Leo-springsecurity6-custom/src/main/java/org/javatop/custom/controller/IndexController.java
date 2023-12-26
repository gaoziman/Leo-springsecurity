package org.javatop.custom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-09 21:19
 * @description : IndexController
 */
@Controller
public class IndexController {

    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }

    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }
}
