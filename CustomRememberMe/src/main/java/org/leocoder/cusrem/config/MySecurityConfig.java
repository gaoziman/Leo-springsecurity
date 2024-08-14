package org.leocoder.cusrem.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-14 09:33
 * @description :
 */
@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    @Resource
    private DataSource dataSource;


    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(User.withUsername("admin").password("{noop}123").roles("admin").build());
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        jdbcTokenRepository.setDataSource(dataSource);
        // 启动时创建表结构，仅在第一次启动时使用
        // jdbcTokenRepository.setCreateTableOnStartup(true);
        return jdbcTokenRepository;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/login.html", "/css/**", "/js/**", "/images/**").permitAll()
                .anyRequest().authenticated()
                // 启用自定义表单登录
                .and()
                .formLogin()
                .loginPage("/login.html")
                // 指定用户名和密码
                .usernameParameter("uname")
                .passwordParameter("upass")
                // 定处理登录请求的URL
                .loginProcessingUrl("/doLogin")
                // 登录成功后跳转的URL
                .defaultSuccessUrl("/index.html")
                // 自定义记住我功能
                .and()
                .rememberMe()
                // 持久化令牌
                .tokenRepository(persistentTokenRepository())

                .and().csrf().disable();

        return http.build();
    }
}
