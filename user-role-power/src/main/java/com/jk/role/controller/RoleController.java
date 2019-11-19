package com.jk.role.controller;

import com.jk.role.model.Role;

import com.jk.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName RoleController
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/17 14:09
 * @Version 1.0
 **/
@RequestMapping("role")
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("queryRole")
    @ResponseBody
    public List<Role> queryRole() {
        List<Role> roles = roleService.queryRole();
        return roles;
    }
}
