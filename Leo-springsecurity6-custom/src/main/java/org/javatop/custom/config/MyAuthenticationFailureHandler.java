package org.javatop.custom.config;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-26 21:20
 * @description : 自定义登录失败处理器
 */
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        HashMap<String, Object> result = new HashMap<>();
        result.put("msg", "登录失败");
        result.put("code", 400);
        result.put("data", exception.getMessage());
        response.setContentType("application/json;charset=utf-8");
//        new ObjectMapper().writeValue(response.getWriter(), result);
        response.getWriter().write(JSONUtil.toJsonStr(result));
    }
}
