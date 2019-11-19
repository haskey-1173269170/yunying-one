package com.jk.user.controller;


import com.jk.user.model.WebUser;
import com.jk.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:40
 * @Version 1.0
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryWebUser")
    @ResponseBody
    public Map<String, Object> queryWebUser(int page, int rows, WebUser webUser) {
        return userService.queryWebUser(page, rows, webUser);
    }

    @RequestMapping("deleteWebUserById")
    @ResponseBody
    public void deleteWebUserById(String id) {
        userService.deleteWebUserById(id);
    }

    @RequestMapping("queryRoleIdByUserId")
    @ResponseBody
    public Integer queryRoleIdByUserId(Integer userId) {
        return userService.queryRoleIdByUserId(userId);
    }

    @RequestMapping("updateroleidbyuserid")
    @ResponseBody
    public void updateroleidbyuserid(Integer userId, Integer roleId) {
        userService.updateroleidbyuserid(userId, roleId);
    }
}
