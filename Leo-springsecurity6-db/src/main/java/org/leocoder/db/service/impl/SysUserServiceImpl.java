package org.leocoder.db.service.impl;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.db.mapper.SysUserMapper;
import org.leocoder.db.domain.SysUser;
import org.leocoder.db.service.SysUserService;
/**
 * @author : Leo
 * @date  2024-06-22 19:59
 * @version 1.0
 * @description :
 */

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

    @Override
    public SysUser loadUserByUsername(String username) {
        return  null;
    }
}
