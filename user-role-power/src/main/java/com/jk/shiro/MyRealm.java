/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MyRealm
 * Author:   zyl
 * Date:     2018/12/26 13:56
 * Description: test
 * History:
 */
package com.jk.shiro;


import com.jk.role.service.RoleService;
import com.jk.user.model.WebUser;
import com.jk.user.service.UserService;
import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description <用一句话描述这个方法>
 * @Param
 * @Return
 * @Author liushuxin
 * @Date 2019/11/22 16:04
 **/
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //将查询到授权信息填充到对象中
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        WebUser webUser = (WebUser) principals.getPrimaryPrincipal();
        List<String> stringList = userService.queryidentByUserId(webUser.getUserid());
        for (String s : stringList) {
            info.addStringPermission(s);
        }
        List<String> roleList =  roleService.queryRoleByUserId(webUser.getUserid());
        for (String s : roleList) {
            info.addRole(s);
        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
        WebUser webUser = userService.queryWebUserByName(token1.getUsername());
        if (webUser == null) {
            return null;
        }
        //查询到返回认证信息
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(webUser, webUser.getUserPwd(), this.getName());
        SecurityUtils.getSubject().getSession().setAttribute("user", webUser);
        return authenticationInfo;
    }

}
