package com.jk.power.mapper;


import com.jk.power.model.Power;

import java.util.List;

/**
 * @ClassName PowerMapper
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:50
 * @Version 1.0
 **/
public interface PowerMapper {
    List<Power> queryPower(Integer pid);

    List<Power> queryAllPower();
}
