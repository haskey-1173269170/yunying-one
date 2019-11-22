package com.jk.money.service;

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
}
