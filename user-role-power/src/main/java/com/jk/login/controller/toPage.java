package com.jk.login.controller;

import com.jk.user.model.WebUser;
import com.jk.user.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName toPage
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:43
 * @Version 1.0
 **/
@Controller
public class toPage {

    @RequestMapping("main")
    public String toMain() {
        return "main";
    }

    @RequestMapping("querywebuser")
    @RequiresPermissions("setting:userManger")
    public String querywebuser() {
        return "user/webusershow";
    }

    @RequestMapping("toshouRoleSelect")
    @RequiresPermissions("setting:roleManger")
    public String shouRoleSelect() {
        return "user/setRolebyUserId";
    }

    @RequestMapping("toqueryRole")
    @RequiresPermissions("setting:roleManger")
    public String toqueryRole() {
        return "role/showRole";
    }

    @RequestMapping("toupdateUser")
    public String toupdateUser() {
        return "user/updateUser";
    }
    @RequestMapping("show")
    public String show() {
        return "shouw";
    }
    @RequestMapping("toupdatepwd")
    public String toupdatepwd(){
        return "user/updatepwd";
    }
    @RequestMapping("403")
    public String to403(){
        return "403";
    }

}
