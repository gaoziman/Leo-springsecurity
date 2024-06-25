package org.leocoder.db.config;

import jakarta.annotation.Resource;
import org.leocoder.db.service.impl.SysUserDetailService;
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


    // 使用基于数据库的数据进行认证
    @Resource
    private SysUserDetailService userDetailService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 放行改资源，不用认证可以直接访问
//                .requestMatchers("/test").permitAll()
                .requestMatchers("/login.html").permitAll()
                // 所有请求都需要认证
                .anyRequest().authenticated()
                // 开启表单登录
                .and().formLogin()
                //我们自定义的登录页面
                .loginPage("/login.html")
                // 处理登录的url
                .loginProcessingUrl("/doLogin")
                .usernameParameter("username")
                .passwordParameter("password")
//                .successForwardUrl("/hello") 访问默认的接口
                // 依然会访问到原来访问的接口
                .defaultSuccessUrl("/test")


//                .failureForwardUrl("/login.html")//登录失败后的forward跳转
//                .failureUrl("/login.html") //redirect跳转

                // 自定义登录失败处理器
                .failureHandler(new MyAuthenticationFailureHandler())

                //自定义退出功能
                .and()
                //开启退出功能的定义
                .logout()
                //退出功能的URL
                .logoutUrl("/out")
                //退出后是否删除session
                .invalidateHttpSession(true)
                //默认为true 清楚当前认证标记
                .clearAuthentication(true)
                .logoutSuccessHandler(new MyLogoutSuccessHandler())

                .and().csrf().disable();
        return http.build();
    }
}
