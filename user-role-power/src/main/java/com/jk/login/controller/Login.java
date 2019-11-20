package com.jk.login.controller;

import com.jk.user.model.WebUser;
import com.jk.user.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Login
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/18 10:27
 * @Version 1.0
 **/
@Controller
@RequestMapping("loginjoin")
public class Login {
    @Autowired
    private UserService userService;

    @RequestMapping("tologin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("login")
    public String login(String username, String password, Model model) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            subject.login(token);
            //登录成功
            //跳转到test.html
            return "redirect:/main";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名不存在");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("loginout")
    public String loginout() {
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
        } catch (Exception e) {
            return "redirect:/loginjoin/login";
        }
        return "login";
    }
    @RequestMapping("toJoin")
    public String toJoin(){
        return "join";
    }
    @RequestMapping("addWebUser")
    @ResponseBody
    public void addWebUser(WebUser webUser){
        userService.addWebUser(webUser);
    }

}
