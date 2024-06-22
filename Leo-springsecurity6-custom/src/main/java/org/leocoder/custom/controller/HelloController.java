package org.leocoder.custom.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-09 17:26
 * @description :
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        //获取用户认证信息
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //登录用户信息
        System.out.println("认证信息 = " + authentication.getPrincipal());
        User user = (User) authentication.getPrincipal();
        System.out.println("用户名 : " + user.getUsername());
        //权限信息
        System.out.println("权限信息 : " + authentication.getAuthorities());
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test() {

         return "test 666";
    }
}
