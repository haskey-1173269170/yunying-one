package com.jk.power.service.impl;

import com.jk.power.mapper.PowerMapper;
import com.jk.power.model.Power;
import com.jk.power.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PowerServiceImpl
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/15 13:49
 * @Version 1.0
 **/
@Service
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerMapper powerMapper;

    @Override
    public List<Power> initPower() {
        List<Power> powerList = queryNodes(0);
        return powerList;
    }

    @Override
    public List<Power> queryAllPower() {
        return powerMapper.queryAllPower();
    }

    private List<Power> queryNodes(Integer pid) {
        List<Power> list = powerMapper.queryPower(pid);
        for (Power power : list) {
            List<Power> nodeList = powerMapper.queryPower(power.getId());
            if (nodeList.size() > 0) {
                power.setChildren(nodeList);
                power.setState("closed");
            }
        }
        return list;
    }

}
