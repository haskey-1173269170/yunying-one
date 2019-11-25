package com.jk.order.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.order.mapper.OrderMapper;
import com.jk.order.model.TOrderinfo;
import com.jk.order.model.TbOrder;
import com.jk.rhyutils.PublicCacheutils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/20 13:34
 **/
@Service
public class OrderServiceImpl implements  OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Map queryOrder(Integer page, Integer rows, TbOrder order) {
        String key = PublicCacheutils.CACHE_ORDER;
        Map<String,Object> m = new HashMap<String,Object>();
        //book判断为null需要进行判断，如果前台传值为空字符串，设定该项属性为null，否则book==null判断始终不成立
        if (order.getOrderid()==null&&order.getMintime()==null&&order.getMaxtime()==null&&redisTemplate.hasKey(key)) {
            List range = redisTemplate.opsForList().range(key,(page-1)*rows,page*rows-1);
            List list2 = new ArrayList();
            for (Object o : range) {
                JSONObject parseObject = JSON.parseObject(o.toString());
                list2.add(parseObject);
                System.err.println(range);
            }
            List pageString =  redisTemplate.opsForList().range(key,0,-1);
            m.put("total", pageString.size());
            m.put("rows", list2);
        }else {
            if (!redisTemplate.hasKey(key)) {
                //查询所有数据存入redis
                List cacheList = orderMapper.queryOrderListAll();
                for (Object o : cacheList) {
                    redisTemplate.opsForList().rightPush(key, JSON.toJSONString(o));
                }
            }
            //正常mysql分页条查
            Page<Object> startPage = PageHelper.startPage(page, rows);
            List list = orderMapper.queryOrderList(order);
            m.put("total", startPage.getTotal());
            m.put("rows", list);
        }
        return m;
    }

    @Override
    public void delOrderByIds(String[] id) {
        String key = PublicCacheutils.CACHE_ORDER;
        orderMapper.delOrderByIds(id);
        redisTemplate.delete(key);
        orderMapper.deleteOrderInfo(id);
    }

    @Override
    public List<TOrderinfo> queryOrderInfoByOrderId(String orderid) {
        return orderMapper.queryOrderInfoByOrderId(orderid);
    }

    @Override
    public List queryNewOrder() {
        return orderMapper.queryNewOrder();
    }
}
