package org.leocoder.remember.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-31 21:11
 * @description : 测试接口
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
