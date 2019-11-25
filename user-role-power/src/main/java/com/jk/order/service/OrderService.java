package com.jk.order.service;

import com.jk.order.model.TOrderinfo;
import com.jk.order.model.TbOrder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName OrderService
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/20 13:33
 **/
public interface OrderService {

    Map queryOrder(Integer page, Integer rows, TbOrder order);

    void delOrderByIds(String[] id);

    List<TOrderinfo> queryOrderInfoByOrderId(String orderid);

    void export(HttpServletResponse response, Integer page, Integer rows, TbOrder order);
}
