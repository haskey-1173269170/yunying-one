package com.jk.money.mapper;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName MoneyMapper
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/22 9:37
 **/
public interface MoneyMapper {

    Integer querynewordercount();

    Integer queryoverordercount();

    Integer queryfailordercount();

    Integer querynewregusercount();

    List queryDiagram();

    List<Map<String, Object>> queryCommdityAnaysis();
}
