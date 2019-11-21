package com.jk.adv.service;

import com.jk.adv.model.Adv;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AdvService
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:33
 **/
public interface AdvService {
    List<Adv> queryAdv(Adv adv);

    void deleteAdvById(String id);

    void addAdv(Adv adv);

    void updateStatus(Integer info, String advid);
}
