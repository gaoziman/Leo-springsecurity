package org.leocoder.db.config;

import cn.hutool.json.JSONUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-26 22:09
 * @description : 自定义登出成功处理器
 */
public class MyLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        HashMap<String, Object> result = new HashMap<>();
        result.put("msg", "退出成功");
        result.put("code", 200);
        //  返回退出成功信息
        result.put("data", authentication);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSONUtil.toJsonStr(result));
    }
}
