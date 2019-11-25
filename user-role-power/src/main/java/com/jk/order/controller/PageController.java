package com.jk.order.controller;

import com.jk.order.model.TOrderinfo;
import com.jk.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @version 1.0
 * @ClassName PageController
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/20 14:33
 **/
@Controller
@RequestMapping("orderPage")
public class PageController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("toShowOrder")
    public String toShowOrder(){
        return "order/showOrder";
    }

    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }

    @RequestMapping("toShowOrderInfo")
    public String toShowOrderInfo(String orderid, Model model){
        model.addAttribute("orderid",orderid);
        List<TOrderinfo> tOrderinfoList = orderService.queryOrderInfoByOrderId(orderid);
        model.addAttribute("list",tOrderinfoList);
        return "order/showOrderInfo";
    }

    @RequestMapping("toDialogPage")
    public String  toDialogPage(){
        return "order/orderDialog";
    }
}
