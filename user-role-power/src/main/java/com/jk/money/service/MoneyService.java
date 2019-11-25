package com.jk.money.service;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName MoneyService
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/22 9:36
 **/
public interface MoneyService {

    Integer querynewordercount();

    Integer queryoverordercount();

    Integer queryfailordercount();

    Integer querynewregusercount();

    /** @Author 原国庆
     * @Description:查询成交单数扇形图
     * @Param: []
     * @Return: java.util.List
     * @Create: 2019/11/22 15:10
     */
    List<Map<String,Object>> queryDiagram();

    /** @Author 原国庆
     * @Description:查询商品柱状图
     * @Param: []
     * @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     * @Create: 2019/11/22 17:35
     */
    List<Map<String, Object>> queryCommdityAnaysis();
}
