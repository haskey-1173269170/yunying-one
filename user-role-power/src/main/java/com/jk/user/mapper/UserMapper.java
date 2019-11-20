package com.jk.user.mapper;

import com.jk.user.model.WebUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapper
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:42
 * @Version 1.0
 **/
public interface UserMapper {
    Integer queryWebUserCount(WebUser webUser);

    List<WebUser> queryWebUser(@Param("s") Integer start, @Param("r") int rows, @Param("w") WebUser webUser);

    void deleteWebUserById(@Param("id") String id);

    Integer queryRoleIdByUserId(Integer userId);

    void deleteWebUserRoleByUserId(Integer userId);

    void addWebUserRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

    WebUser queryWebUserByName(String username);

    List<String> queryidentByUserId(Integer userid);

    List<Map<String, Object>> querArea(Integer pid);

    WebUser queryUserById(Integer userid);

    void updateWebUser(WebUser webUser);

    String queryPwdById(Integer userid);

    void updatePwd(@Param("id") Integer userid, @Param("pwd") String newpwd);

    void addWebUser(WebUser webUser);
}
