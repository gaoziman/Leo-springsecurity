package org.leocoder.test.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-22 20:00
 * @description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class SysUser implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "`password`")
    private String password;

    @TableField(value = "enabled")
    private Boolean enabled;

    @TableField(value = "account_non_expired")
    private Boolean accountNonExpired;

    @TableField(value = "account_non_locked")
    private Boolean accountNonLocked;

    @TableField(value = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    private static final long serialVersionUID = 1L;
}