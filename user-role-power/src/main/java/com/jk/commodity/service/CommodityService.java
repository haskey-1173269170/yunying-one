package com.jk.commodity.service;

import com.jk.commodity.model.*;
import com.jk.image.model.Image;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CommodityService
 * @Description
 * @Author
 * @Date 2019/11/19 19:26
 * @Version V1.0
 **/
public interface CommodityService {
    /** 功能描述: 查询商品表 分页加 条件查询
    * @param :[page, rows, commodity]
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 15:59
    */
    Map<String, Object> queryCommodity(Integer page, Integer rows, Commodity commodity);

    /** 功能描述:上架状态改为 下架
    * @param :[id]
    * @return: void
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:00
    */
    void soldOut(Integer id);
    /** 功能描述:未上架商品列表 + 分页
    * @param :[page, rows, commodity]
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:00
    */
    Map<String, Object> queryNotSoldCommodity(Integer page, Integer rows, Commodity commodity);

    /** 功能描述:下架状态改为上架
    * @param :[id]
    * @return: void
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:01
    */
    void putaway(Integer id);

    /** 功能描述:批量删除未上架物品
    * @param :[ids]
    * @return: void
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:01
    */
    void deleteAll(String ids);

    /** 功能描述: 查询库存 联查  商品表 加 颜色表 加 中间表
    * @param :[id]
    * @return: java.util.List<com.jk.image.model.Image>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:01
    */
    List<Image> particulars(Integer id);

    /** 功能描述:增加颜色对应库存
    * @param :[image]
    * @return: void
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:02
    */
    void zengCount(Image image);
    /** 功能描述:减少颜色对应库存
    * @param :[image]
    * @return: void
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:02
    */
    void jianCount(Image image);
    /** 功能描述:下拉列表 展示 查询 cpu 表
    * @param :[]
    * @return: java.util.List<com.jk.commodity.model.ProductCPU>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:03
    */
    List<ProductCPU> queryCpu();

    /** 功能描述:下拉列表 展示 查询 产地表
    * @param :[]
    * @return: java.util.List<com.jk.commodity.model.ProductOrigin>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:03
    */
    List<ProductOrigin> queryOrigin();

    /** 功能描述:下拉列表 展示 查询 系统表
    * @param :[]
    * @return: java.util.List<com.jk.commodity.model.Operatingsystem>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:03
    */
    List<Operatingsystem> querySystem();
    /** 功能描述:下拉列表 展示查询类型表 二级联动
    * @param :[]
    * @return: java.util.List<com.jk.commodity.model.Type>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:04
    */
    List<Type> queryType();
    /** 功能描述:下拉列表 展示查询品牌表 二级联动
    * @param :[id]
    * @return: java.util.List<com.jk.commodity.model.Productbrand>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:04
    */
    List<Productbrand> queryBrand(Integer id);
    /** 功能描述:下拉列表 展示查询颜色表
    * @param :[]
    * @return: java.util.List<com.jk.image.model.Image>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:06
    */
    List<Image> queryColor();
    /** 功能描述:查询所有 版本 给每个颜色赋值 中间表
    * @param :[]
    * @return: java.util.List<com.jk.commodity.model.Productversion>
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:07
    */
    List<Productversion> queryVersion();
    /** 功能描述:新增商品
    * @param :[commodity]
    * @return: void
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:08
    */
    void addCommodity(Commodity commodity);
    /** 功能描述:详情列表展示
    * @param :[id]
    * @return: com.jk.commodity.model.Commodity
    * @Author: wuxiaobin
    * @Date: 2019/11/21 16:08
    */
    Commodity xiangQing(Integer id);

    void export(HttpServletResponse response, int page, int rows);
}
