package com.jk.image.controller;

import com.jk.image.model.Image;
import com.jk.image.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ImageController
 * @Description
 * @Author
 * @Date 2019/11/20 11:34
 * @Version V1.0
 **/
@Controller
@RequestMapping("image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @RequestMapping("addImage")
    @ResponseBody
    public void addImage(Image image){
        imageService.addImage(image);
    }

    @RequestMapping("toaddImage")
    public String toaddImage(){
        return "image/addImage";
    }
}
