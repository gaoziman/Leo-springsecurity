package org.leocoder.test.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.test.mapper.SysUserMapper;
import org.leocoder.test.domain.SysUser;
import org.leocoder.test.service.SysUserService;
/**
 * @author : Leo
 * @date  2024-06-22 19:59
 * @version 1.0
 * @description :
 */

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

}
