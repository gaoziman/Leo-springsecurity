package org.leocoder.db.service.impl;

import jakarta.annotation.Resource;
import org.leocoder.db.domain.SysUser;
import org.leocoder.db.mapper.SysUserMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-25 11:31
 * @description :
 */
@Service
public class SysUserDetailService implements UserDetailsService {

    @Resource
    private SysUserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = userMapper.selectUserByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        return sysUser;
    }
}
