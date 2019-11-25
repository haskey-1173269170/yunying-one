package com.jk.user.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.commodity.model.Commodity;
import com.jk.lsxutils.ExportExcel;
import com.jk.user.mapper.UserMapper;
import com.jk.user.model.WebUser;
import com.jk.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:41
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> queryWebUser(int page, int rows, WebUser webUser) {


        Page<Object> objects = PageHelper.startPage(page, rows);
        List<WebUser> webUserList = userMapper.queryWebUser(webUser);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", objects.getTotal());
        map.put("rows", webUserList);
        return map;
    }

    @Override
    public void deleteWebUserById(String id) {
        userMapper.deleteWebUserById(id);
    }

    @Override
    public Integer queryRoleIdByUserId(Integer userId) {
        return userMapper.queryRoleIdByUserId(userId);
    }

    @Override
    public void updateroleidbyuserid(Integer userId, Integer[] roleId) {
        userMapper.deleteWebUserRoleByUserId(userId);
        userMapper.addWebUserRole(userId, roleId);
    }

    @Override
    public WebUser queryWebUserByName(String username) {
        WebUser webUser = userMapper.queryWebUserByName(username);
        return webUser;
    }

    @Override
    public List<String> queryidentByUserId(Integer userid) {
        return userMapper.queryidentByUserId(userid);
    }

    @Override
    public List<Map<String, Object>> querArea(Integer pid) {
        List<Map<String, Object>> mapList =  userMapper.querArea(pid);
        return mapList;
    }

    @Override
    public WebUser queryUserById(Integer userid) {
        return userMapper.queryUserById(userid);
    }

    @Override
    public void updateWebUser(WebUser webUser) {
        userMapper.updateWebUser(webUser);
    }

    @Override
    public String updatePwd(String oldpwd, String newpwd, HttpServletRequest request) {
        WebUser webUser = (WebUser) request.getSession().getAttribute("user");
        String pwd = userMapper.queryPwdById(webUser.getUserid());
        if (pwd.equals(oldpwd)){
            userMapper.updatePwd(webUser.getUserid(),newpwd);
            return "success";
        }
        return "fail";

    }

    @Override
    public void addWebUser(WebUser webUser) {
        userMapper.addWebUser(webUser);
    }

    @Override
    public void export(HttpServletResponse response, int page, int rows) {
        List<WebUser> list= new ArrayList<WebUser>();

        try {
            Page<Object> objects = PageHelper.startPage(page, rows);
            list = userMapper.queryWebUser(new WebUser());

            //定义表格的标题
            String title ="管理员信息";
            //定义列名
            String[] rowName={"用户名", "姓名","性别","生日","入职时间","地区","角色"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            //循环数据把数据存放到 List<Object[]>
            for (WebUser webUser:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=webUser.getUserid();
                obj[1]=webUser.getUserName();
                if (webUser.getUserSex()==1){
                    obj[2]="男";
                }else {
                    obj[2]="女";
                }
                obj[3]=webUser.getBirthday().toLocaleString();
                obj[4]=webUser.getCreateDate().toLocaleString();
                obj[5]=webUser.getArea();
                obj[6]=webUser.getRname();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
