package com.jk.commodity.mapper;

import com.jk.commodity.model.*;
import com.jk.image.model.Image;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CommodityMapper
 * @Description
 * @Author
 * @Date 2019/11/19 19:26
 * @Version V1.0
 **/
public interface CommodityMapper {
    List<Commodity> queryCommodity(Commodity commodity);

    void soldOut(Integer id);

    List<Commodity> queryNotSoldCommodity(Commodity commodity);

    void putaway(Integer id);

    void deleteAll(@Param("ids") String ids);

    List<Image> particulars(Integer id);

    void zengCount(Image image);

    void jianCount(Image image);

    List<ProductCPU> queryCpu();

    List<ProductOrigin> queryOrigin();

    List<Operatingsystem> querySystem();

    List<Type> queryType();

    List<Productbrand> queryBrand(Integer id);

    List<Image> queryColor();

    List<Productversion> queryVersion();

    void addCommodity(Commodity commodity);

    void addCommodityAndColor(List<CommodityColor> list);

    Commodity xiangQing(Integer id);

    SolrGoods querySolrGoodsByCommid(Integer productId);
}
