package org.leocoder.cusrem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-14 09:30
 * @description : 自定义记住我功能启动类
 */

@SpringBootApplication
public class CustomRememberApplication {
    public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(CustomRememberApplication.class, args);
            Environment environment = context.getBean(Environment.class);

            System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
            System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
        }
}
