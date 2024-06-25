package org.leocoder.db.service;

import org.leocoder.db.domain.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author : Leo
 * @date  2024-06-22 19:59
 * @version 1.0
 * @description :
 */

public interface SysUserService extends IService<SysUser>{


        /**
         * 根据用户名查询用户信息
         * @param username 用户名
         * @return 用户信息
         */
        SysUser loadUserByUsername(String username);

    }
