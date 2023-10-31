package com.Leo.start.service;


import com.Leo.start.domain.ResponseResult;
import com.Leo.start.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
