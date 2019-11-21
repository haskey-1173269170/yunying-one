package com.jk.image.mapper;

import com.jk.commodity.model.VersionColor;
import com.jk.image.model.Image;

import java.util.List;

/**
 * @ClassName ImageMapper
 * @Description
 * @Author
 * @Date 2019/11/20 11:35
 * @Version V1.0
 **/
public interface ImageMapper {
    void addImage(Image image);

    String queryVersionId();

    void addImageAndVersion(List<VersionColor> list);
}
