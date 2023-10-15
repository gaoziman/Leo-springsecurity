package com.Leo.init.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-14 20:58
 * @description : 测试
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello()
    {

        return "hello";
    }
}
