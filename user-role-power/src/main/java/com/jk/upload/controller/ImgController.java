package com.jk.upload.controller;

import com.jk.upload.utils.OSSClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("img")
public class ImgController {


    /**
     * OSS阿里云上传图片
     * @return
     */
    @RequestMapping("updaloadImg")
    @ResponseBody
    public Map uploadImg(MultipartFile img)throws IOException {
        if (img == null || img.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(img);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        System.out.println("图片url："+split[0]);
        Map map = new HashMap();
        map.put("imgUrl",split[0]);
        return map;
    }
}
