package org.javatop.custom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-09 17:45
 * @description :
 */
@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers("/test").permitAll() // 放行改资源，不用认证可以直接访问
                .requestMatchers("/login.html").permitAll()
                .anyRequest().authenticated() // 所有请求都需要认证
                .and().formLogin() // 开启表单登录
                .loginPage("/login.html") //我们自定义的登录页面
                .loginProcessingUrl("/doLogin") // 处理登录的url
                .usernameParameter("username")
                .passwordParameter("password")

        ;
        return http.build();
    }
}
