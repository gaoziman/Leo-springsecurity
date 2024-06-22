package org.leocoder.custom.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-10 22:03
 * @description : 响应成功之后的JSON
 */
public class MyAuthenticationSuccessHandle implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        HashMap<String, Object> result = new HashMap<>();
        result.put("msg", "登录成功");
        result.put("code", 200);

        response.setContentType("application/json;charset=utf-8");
        new ObjectMapper().writeValue(response.getWriter(), result);
    }
}
