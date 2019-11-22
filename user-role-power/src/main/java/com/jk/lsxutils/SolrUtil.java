package com.jk.lsxutils;

import com.jk.commodity.mapper.CommodityMapper;
import com.jk.commodity.model.SolrGoods;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @ClassName addSolr
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/11/22 15:18
 * @Version 1.0
 **/
@Component
public  class SolrUtil {
    @Autowired
    private  CommodityMapper commodityMapper;
    @Autowired
    private  SolrClient solrClient;
    public  void  addSolr(Integer id){
        SolrGoods goods = commodityMapper.querySolrGoodsByCommid(id);
        try {
            SolrInputDocument document = new SolrInputDocument();
            document.setField("id",goods.getId());
            document.setField("name",goods.getName());
            document.setField("description",goods.getDescription());
            document.setField("price",goods.getPrice());
            document.setField("color",goods.getColor());
            document.setField("img",goods.getImg());
            document.setField("camera",goods.getCamera());
            document.setField("sale",goods.getSale());
            document.setField("systemId",goods.getSystemId());
            document.setField("system",goods.getSystem());
            document.setField("time",goods.getTime());
            document.setField("brandId",goods.getBrandId());
            document.setField("brand",goods.getBrand());
            document.setField("typeId",goods.getTypeId());
            document.setField("typename",goods.getTypeName());
            solrClient.add("core1",document);
            solrClient.commit("core1");
            solrClient.close();
        }catch (Exception e){

        }
    }
    public void deletesolr(Integer id){
        try {
            solrClient.deleteById("core1",id.toString());
            solrClient.commit("core1");
            solrClient.close();
        }catch (Exception e){

        }
    }
}
