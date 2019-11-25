package com.jk.cmsuser.service;

import java.util.List;
import java.util.Map;

public interface CmsService {
    /** @Author 原国庆
     * @Description:查询用户hightcharts
     * @Param: []
     * @Return: java.util.List
     * @Create: 2019/11/22 21:30
     */
    Map queryCms();

    /** @Author 原国庆
     * @Description:查询上月新用户注册
     * @Param: []
     * @Return: java.util.List
     * @Create: 2019/11/24 18:17
     */
    List queryNewCmsUser();
}
