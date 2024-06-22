package org.leocoder.custom.config;

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
//                .requestMatchers("/test").permitAll() // 放行改资源，不用认证可以直接访问
                .requestMatchers("/login.html").permitAll()
                .anyRequest().authenticated() // 所有请求都需要认证
                .and().formLogin() // 开启表单登录
                .loginPage("/login.html") //我们自定义的登录页面
                .loginProcessingUrl("/doLogin") // 处理登录的url
                .usernameParameter("username")
                .passwordParameter("password") //
//                .successForwardUrl("/hello") 访问默认的接口
                .defaultSuccessUrl("/test") // 依然会访问到原来访问的接口


//                .failureForwardUrl("/login.html")//登录失败后的forward跳转
//                .failureUrl("/login.html") //redirect跳转

                .failureHandler(new MyAuthenticationFailureHandler())// 自定义登录失败处理器

                //自定义退出功能
                .and()
                .logout() //开启退出功能的定义
                .logoutUrl("/out")//退出功能的URL
                .invalidateHttpSession(true) //退出后是否删除session
                .clearAuthentication(true)//默认为true 清楚当前认证标记
                .logoutSuccessHandler(new MyLogoutSuccessHandler())

                .and().csrf().disable();
        return http.build();
    }
}
