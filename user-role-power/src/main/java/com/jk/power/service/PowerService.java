package com.jk.power.service;


import com.jk.power.model.Power;

import java.util.List;

/**
 * @ClassName PowerService
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:48
 * @Version 1.0
 **/
public interface PowerService {
    /**
     * @Description <查询树>
     * @Param []
     * @Return java.util.List<com.jk.model.Power>
     * @Author liushuxin
     * @Date 2019/11/15 14:46
     **/
    List<Power> initPower();

    List<Power> queryAllPower();
}
