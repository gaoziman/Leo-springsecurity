package org.leocoder.start.service;


import org.leocoder.start.domain.ResponseResult;
import org.leocoder.start.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
