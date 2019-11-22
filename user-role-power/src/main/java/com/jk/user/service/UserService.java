package com.jk.user.service;


import com.jk.user.model.WebUser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserService
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:41
 * @Version 1.0
 **/
public interface UserService {
    /**
     * @return
     * @Description <查询webUser>
     * @Param [page, rows, webUser]
     * @Return java.util.List<com.jk.model.WebUser>
     * @Author liushuxin
     * @Date 2019/11/15 16:12
     */
    Map<String, Object> queryWebUser(int page, int rows, WebUser webUser);

    /**
     * @Description <根据id删除用户>
     * @Param [id]
     * @Return void
     * @Author liushuxin
     * @Date 2019/11/15 17:24
     **/
    void deleteWebUserById(String id);
    /**
     * @Description <查询角色通过用户id>
     * @Param [userId]
     * @Return java.lang.Integer
     * @Author liushuxin
     * @Date 2019/11/22 16:13
     **/
    Integer queryRoleIdByUserId(Integer userId);
    /**
     * @Description <查询用户角色中间表>
     * @Param [userId, roleId]
     * @Return void
     * @Author liushuxin
     * @Date 2019/11/22 16:13
     **/

    void updateroleidbyuserid(Integer userId, Integer roleId);
    /**
     * @Description <登录查询>
     * @Param [username]
     * @Return com.jk.user.model.WebUser
     * @Author liushuxin
     * @Date 2019/11/22 16:13
     **/
    WebUser queryWebUserByName(String username);
    /**
     * @Description <查询权限>
     * @Param [userid]
     * @Return java.util.List<java.lang.String>
     * @Author liushuxin
     * @Date 2019/11/22 16:14
     **/
    List<String> queryidentByUserId(Integer userid);
    /**
     * @Description <查询地区>
     * @Param [pid]
     * @Return java.util.List<java.util.Map < java.lang.String, java.lang.Object>>
     * @Author liushuxin
     * @Date 2019/11/22 16:14
     **/
    List<Map<String, Object>> querArea(Integer pid);
    /**
     * @Description <根据id查询用户>
     * @Param [userid]
     * @Return com.jk.user.model.WebUser
     * @Author liushuxin
     * @Date 2019/11/22 16:14
     **/
    WebUser queryUserById(Integer userid);
    /**
     * @Description <修改用户信息>
     * @Param [webUser]
     * @Return void
     * @Author liushuxin
     * @Date 2019/11/22 16:14
     **/
    void updateWebUser(WebUser webUser);
    /**
     * @Description <修改密码>
     * @Param [oldpwd, newpwd, request]
     * @Return java.lang.String
     * @Author liushuxin
     * @Date 2019/11/22 16:14
     **/
    String updatePwd(String oldpwd, String newpwd, HttpServletRequest request);
    /**
     * @Description <添加用户>
     * @Param [webUser]
     * @Return void
     * @Author liushuxin
     * @Date 2019/11/22 16:14
     **/
    void addWebUser(WebUser webUser);
}
