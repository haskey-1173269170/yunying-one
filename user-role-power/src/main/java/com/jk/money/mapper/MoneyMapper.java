package com.jk.money.mapper;

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
}
