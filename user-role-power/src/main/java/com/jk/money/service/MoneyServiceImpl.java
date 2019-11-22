package com.jk.money.service;

import com.jk.money.mapper.MoneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @ClassName MoneyServiceImpl
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/22 9:36
 **/
@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;

    @Override
    public Integer querynewordercount() {
        Integer querynewordercount = moneyMapper.querynewordercount();
        System.out.println(querynewordercount);
        return querynewordercount;
    }

    @Override
    public Integer queryoverordercount() {
        return moneyMapper.queryoverordercount();
    }

    @Override
    public Integer queryfailordercount() {
        return moneyMapper.queryfailordercount();
    }

    @Override
    public Integer querynewregusercount() {
        return moneyMapper.querynewregusercount();
    }
}
