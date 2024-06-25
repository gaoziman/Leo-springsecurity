package org.leocoder.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-25 15:29
 * @description : 主页面
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
