package com.jk.order.controller;

import com.jk.order.model.TOrderinfo;
import com.jk.order.model.TbOrder;
import com.jk.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName OrderController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/20 13:33
 **/
@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("queryOrder")
    @ResponseBody
    public Map queryOrder(Integer page, Integer rows, TbOrder order){
        if ("".equals(order.getOrderid())){
            order.setOrderid(null);
        }
        if("".equals(order.getMintime())){
            order.setMintime(null);
        }
        if("".equals(order.getMaxtime())){
            order.setMaxtime(null);
        }
        return orderService.queryOrder(page,rows,order);
    }
    @RequestMapping("delOrderByIds")
    @ResponseBody
    public void delOrderByIds(String[] id){//批量删除订单
         orderService.delOrderByIds(id);
    }
    @RequestMapping("queryOrderInfoByOrderId")
    @ResponseBody
    public List<TOrderinfo> queryOrderInfoByOrderId(String orderid){//根据订单查询详情
         return orderService.queryOrderInfoByOrderId(orderid);
    }

    @RequestMapping("queryNewOrder")
    @ResponseBody
    public List  queryNewOrder(){
        return orderService.queryNewOrder();
    }
}
