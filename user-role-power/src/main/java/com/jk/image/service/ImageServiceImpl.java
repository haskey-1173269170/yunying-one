package com.jk.image.service;

import com.jk.commodity.model.CommodityColor;
import com.jk.commodity.model.VersionColor;
import com.jk.image.mapper.ImageMapper;
import com.jk.image.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ImageServiceImpl
 * @Description
 * @Author
 * @Date 2019/11/20 11:36
 * @Version V1.0
 **/
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Override
    public void addImage(Image image) {
        imageMapper.addImage(image);
        String versionId = imageMapper.queryVersionId();
        List<VersionColor> list = new ArrayList<VersionColor>();
        String[] split = versionId.split(",");
        for (String s : split) {
            VersionColor v = new VersionColor();
            v.setProductColorid(image.getProductColor_id());
            v.setProductVersionid(Integer.parseInt(s));
            list.add(v);
        }
        imageMapper.addImageAndVersion(list);
    }
}
