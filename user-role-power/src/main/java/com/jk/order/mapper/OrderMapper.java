package com.jk.order.mapper;

import com.jk.order.model.TOrderinfo;
import com.jk.order.model.TbOrder;

import java.util.List;

/**
 * @version 1.0
 * @ClassName OrderMapper
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/20 13:36
 **/
public interface OrderMapper {

    List<TbOrder> queryOrderList(TbOrder order);

    List<TbOrder> queryOrderListAll();

    void delOrderByIds(String[] id);

    void deleteOrderInfo(String[] id);

    List<TOrderinfo> queryOrderInfoByOrderId(String orderid);
}
