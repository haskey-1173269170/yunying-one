package com.jk.role.service.impl;

import com.jk.role.mapper.RoleMapper;
import com.jk.role.model.Role;
import com.jk.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RoleServiceImpl
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/17 14:10
 * @Version 1.0
 **/
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> queryRole() {
        return roleMapper.queryRole();
    }

    @Override
    public List<String> queryRoleByUserId(Integer userid) {
        return roleMapper.queryRoleByUserId(userid);
    }
}
