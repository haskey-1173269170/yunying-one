package com.jk.adv.mapper;

import com.jk.adv.model.Adv;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AdvMapper
 * @Description TODO
 * @Author rhy
 * @Date 2019/11/21 11:33
 **/
public interface AdvMapper {
    List<Adv> queryAdv(Adv adv);

    void deleteAdvById(String id);

    void addAdv(Adv adv);

    void updateStatus(@Param("info") Integer info, @Param("advid") String advid);

}
