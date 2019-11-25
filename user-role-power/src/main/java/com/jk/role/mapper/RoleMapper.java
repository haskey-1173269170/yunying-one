package com.jk.role.mapper;


import com.jk.role.model.Role;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/17 14:10
 * @Version 1.0
 **/
public interface RoleMapper {
    List<Role> queryRole();

    List<String> queryRoleByUserId(Integer userid);
}
