package org.leocoder.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.leocoder.db.domain.SysUser;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-22 20:00
 * @description :
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}