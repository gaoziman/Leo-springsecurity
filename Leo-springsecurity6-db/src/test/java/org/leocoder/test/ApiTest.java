package org.leocoder.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Test;
import org.leocoder.db.DbApplication;
import org.leocoder.db.domain.SysUser;
import org.leocoder.db.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-22 20:08
 * @description :
 */
@SpringBootTest(classes = DbApplication.class)
public class ApiTest {

    @Autowired
    private SysUserService userService;

    /**
     *  用于测试: 测试代码是否正常
     */
    @Test
    public void test01() {
        SysUser admin = userService.getOne(new LambdaQueryWrapper<SysUser>().eq(SysUser::getUsername, "admin"));
        System.out.println(admin);
    }
}
