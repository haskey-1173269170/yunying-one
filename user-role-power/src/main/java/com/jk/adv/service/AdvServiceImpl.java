package com.jk.adv.service;

import com.jk.adv.mapper.AdvMapper;
import com.jk.adv.model.Adv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AdvServiceImpl
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:33
 **/

@Service
public class AdvServiceImpl implements  AdvService{

    @Autowired
    private AdvMapper advMapper;

    @Override
    public List<Adv> queryAdv(Adv adv) {
        return advMapper.queryAdv(adv);
    }

    @Override
    public void deleteAdvById(String id) {
        advMapper.deleteAdvById(id);
    }

    @Override
    public void addAdv(Adv adv) {
        advMapper.addAdv(adv);
    }

    @Override
    public void updateStatus(Integer info, String advid) {
        advMapper.updateStatus(info,advid);
    }
}
