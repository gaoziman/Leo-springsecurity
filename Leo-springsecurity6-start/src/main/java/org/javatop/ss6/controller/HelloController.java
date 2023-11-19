package org.javatop.ss6.controller;

import jakarta.servlet.Filter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-31 15:02
 * @description :
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

         return "hello......";
    }


    @RequestMapping("/test")
    public String test() {

        return "hello,SpringSecurity6!!!";
    }
}
