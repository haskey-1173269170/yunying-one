package com.jk.adv.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.adv.mapper.AdvMapper;
import com.jk.adv.model.Adv;
import com.jk.commodity.model.Commodity;
import com.jk.lsxutils.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @ClassName AdvServiceImpl
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:33
 **/

@Service
public class AdvServiceImpl implements  AdvService{

    @Autowired
    private AdvMapper advMapper;

    @Override
    public List<Adv> queryAdv(Adv adv) {
        return advMapper.queryAdv(adv);
    }

    @Override
    public void deleteAdvById(String id) {
        advMapper.deleteAdvById(id);
    }

    @Override
    public void addAdv(Adv adv) {
        advMapper.addAdv(adv);
    }

    @Override
    public void updateStatus(Integer info, String advid) {
        advMapper.updateStatus(info,advid);
    }

    @Override
    public void export(HttpServletResponse response) {
        List<Adv> list= new ArrayList<Adv>();

        try {
            list = advMapper.queryAdv(new Adv());

            //定义表格的标题
            String title ="商品信息";
            //定义列名
            String[] rowName={"广告编号","广告主题","海报地址","广告简介","发布时间","广告链接","广告类型","发布状态"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            //循环数据把数据存放到 List<Object[]>
            for (Adv adv:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=adv.getAdvid();
                obj[1]=adv.getAdvname();
                obj[2]=adv.getAdvimg();
                obj[3]=adv.getAdvinfo();
                obj[4]=sdf.parse(adv.getAdvdate()).toLocaleString();
                obj[5]=adv.getAdvurl();
                if (Integer.valueOf(adv.getAdvyn())==0){
                    obj[6]="页脚广告";
                }else {
                    obj[6]="首页轮播图";
                }
                if (Integer.valueOf(adv.getAdvstatus())==1){
                    obj[7]="正在发布";
                }else {
                    obj[7]="停止发布";

                }
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
