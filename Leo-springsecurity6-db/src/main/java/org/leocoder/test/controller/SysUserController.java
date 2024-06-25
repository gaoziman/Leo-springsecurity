package org.leocoder.test.controller;
import org.leocoder.test.domain.SysUser;
import org.leocoder.test.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
* (sys_user)表控制层
*
* @author Leo
*/
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("/{id}")
    public SysUser getUser(@PathVariable Long id) {
        return userService.getById(id);
    }
}
