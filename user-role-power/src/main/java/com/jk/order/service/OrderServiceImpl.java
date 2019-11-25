package com.jk.order.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.lsxutils.ExportExcel;
import com.jk.order.mapper.OrderMapper;
import com.jk.order.model.TOrderinfo;
import com.jk.order.model.TbOrder;
import com.jk.rhyutils.PublicCacheutils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.security.Key;
import java.text.SimpleDateFormat;
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
        //正常mysql分页条查
        Page<Object> startPage = PageHelper.startPage(page, rows);
        List list = orderMapper.queryOrderList(order);
        m.put("total", startPage.getTotal());
        m.put("rows", list);
        return m;
    }

    @Override
    public void delOrderByIds(String[] id) {
        String key = PublicCacheutils.CACHE_ORDER;
        orderMapper.delOrderByIds(id);
        orderMapper.deleteOrderInfo(id);
    }

    @Override
    public List<TOrderinfo> queryOrderInfoByOrderId(String orderid) {
        return orderMapper.queryOrderInfoByOrderId(orderid);
    }

    @Override
    public void export(HttpServletResponse response, Integer page, Integer rows, TbOrder order) {
        List<TbOrder> list= new ArrayList<TbOrder>();
        try {
            Page<Object> startPage = PageHelper.startPage(page, rows);
            list = orderMapper.queryOrderList(order);

            //定义表格的标题
            String title ="订单信息";
            //定义列名
            String[] rowName={"订单编号","订单金额","订单状态","支付类型","收货地址","联系电话","收货人","下单时间"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            //循环数据把数据存放到 List<Object[]>
            for (TbOrder order1:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=order1.getOrderid();
                obj[1]=order1.getPayment()+"元";
                if (Integer.parseInt(order1.getStatus())==0){
                    obj[2]="待付款";
                }
                if (Integer.parseInt(order1.getStatus())==1){
                    obj[2]="未付款";
                }
                if (Integer.parseInt(order1.getStatus())==2){
                    obj[2]="已付款";
                }
                obj[3]="在线支付";
                obj[4]=order1.getRecarea();
                obj[5]=order1.getRecphone();
                obj[6]=order1.getReceiver();
                obj[7]=sdf.parse(order1.getCreatetime()).toLocaleString();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
