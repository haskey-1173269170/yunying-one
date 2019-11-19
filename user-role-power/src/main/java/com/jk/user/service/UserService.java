package com.jk.user.service;


import com.jk.user.model.WebUser;

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
     * @Description <用一句话描述这个方法>
     * @Param [id]
     * @Return void
     * @Author liushuxin
     * @Date 2019/11/15 17:24
     **/
    void deleteWebUserById(String id);

    Integer queryRoleIdByUserId(Integer userId);

    void updateroleidbyuserid(Integer userId, Integer roleId);

    WebUser queryWebUserByName(String username);

    List<String> queryidentByUserId(Integer userid);
}
