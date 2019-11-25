package com.jk.commodity.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.commodity.mapper.CommodityMapper;
import com.jk.commodity.model.*;
import com.jk.image.model.Image;
import com.jk.lsxutils.ExportExcel;
import com.jk.lsxutils.SolrUtil;
import com.jk.order.model.TbOrder;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CommodityServiceImpl
 * @Description
 * @Author
 * @Date 2019/11/19 19:27
 * @Version V1.0
 **/
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private SolrClient solrClient;
    @Autowired
    private SolrUtil solrUtil;

    @Override
    public Map<String, Object> queryCommodity(Integer page, Integer rows, Commodity commodity) {
        Page<Commodity> objects = PageHelper.startPage(page, rows);

        List<Commodity> list = commodityMapper.queryCommodity(commodity);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total",objects.getTotal());
        map.put("rows",list);
        return map;
    }
    /*下架*/
    @Override
    public void soldOut(Integer id) {
        commodityMapper.soldOut(id);
        solrUtil.deletesolr(id);
    }

    @Override
    public Map<String, Object> queryNotSoldCommodity(Integer page, Integer rows, Commodity commodity) {
        Page<Commodity> objects = PageHelper.startPage(page, rows);

        List<Commodity> list = commodityMapper.queryNotSoldCommodity(commodity);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total",objects.getTotal());
        map.put("rows",list);
        return map;
    }
    /*上架*/
    @Override
    public void putaway(Integer id) {
        commodityMapper.putaway(id);
        solrUtil.addSolr(id);
    }

    @Override
    public void deleteAll(String ids) {
        commodityMapper.deleteAll(ids);
        String[] split = ids.split(",");
        for (String s : split) {
            solrUtil.deletesolr(Integer.valueOf(s));
        }
    }

    @Override
    public List<Image> particulars(Integer id) {
        return commodityMapper.particulars(id);
    }

    @Override
    public void zengCount(Image image) {
        commodityMapper.zengCount(image);
    }

    @Override
    public void jianCount(Image image) {
        commodityMapper.jianCount(image);
    }

    @Override
    public List<ProductCPU> queryCpu() {
        return commodityMapper.queryCpu();
    }

    @Override
    public List<ProductOrigin> queryOrigin() {
        return commodityMapper.queryOrigin();
    }

    @Override
    public List<Operatingsystem> querySystem() {
        return commodityMapper.querySystem();
    }

    @Override
    public List<Type> queryType() {
        return commodityMapper.queryType();
    }

    @Override
    public List<Productbrand> queryBrand(Integer id) {
        return commodityMapper.queryBrand(id);
    }


    @Override
    public List<Image> queryColor() {
        return commodityMapper.queryColor();
    }

    @Override
    public List<Productversion> queryVersion() {

        return commodityMapper.queryVersion();
    }

    @Override
    public void addCommodity(Commodity commodity) {
        commodityMapper.addCommodity(commodity);
        String[] split = commodity.getProductColorName().split(",");
        List<CommodityColor> list = new ArrayList<CommodityColor>();
        for (String s : split) {
            CommodityColor c= new CommodityColor();
            c.setCommodityid(commodity.getProductId());
            c.setProductColorid(Integer.parseInt(s));
            list.add(c);
        }
        commodityMapper.addCommodityAndColor(list);
        solrUtil.addSolr(commodity.getProductId());
    }

    @Override
    public Commodity xiangQing(Integer id) {
        return commodityMapper.xiangQing(id);
    }

    @Override
    public void export(HttpServletResponse response, int page, int rows) {
        List<Commodity> list= new ArrayList<Commodity>();

        try {
            Page<Commodity> objects = PageHelper.startPage(page, rows);
            list = commodityMapper.queryNotSoldCommodity2();

            //定义表格的标题
            String title ="商品信息";
            //定义列名
            String[] rowName={"商品编号","商品名称","商品价格","入网型号","产地","上架时间","上市时间","分辨率","商品销量","品牌"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            //循环数据把数据存放到 List<Object[]>
            for (Commodity commodity1:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=commodity1.getProductId();
                obj[1]=commodity1.getProductName();
                obj[2]=commodity1.getCommodityPrice();
                obj[3]=commodity1.getTheNetModel();
                obj[4]=commodity1.getProductOriginname();
                obj[5]=commodity1.getUpAndDownTime().toLocaleString();
                obj[6]=commodity1.getTimeToMarket().toLocaleString();
                obj[7]=commodity1.getResolutionRatio();
                obj[8]=commodity1.getCommoditySales();
                obj[9]=commodity1.getProductBrandname();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
