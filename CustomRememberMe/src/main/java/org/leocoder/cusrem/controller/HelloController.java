package org.leocoder.cusrem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-14 09:30
 * @description :
 */

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
