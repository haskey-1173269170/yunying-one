package com.jk.comment.controller;

import com.jk.comment.model.Talk;
import com.jk.comment.service.CommentService;
import com.jk.user.model.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("talk")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("queryComment")
    @ResponseBody
    public Map queryComment(Integer page, Integer rows, Talk talk){
        Map m=commentService.queryComment(page,rows,talk);
        return m;
    }
    @RequestMapping("delTalk")
    @ResponseBody
    public void delTalk(String id){
        commentService.delTalk(id);
    }
    @RequestMapping("addTalk")
    @ResponseBody
    public void addTalk(Talk ta, HttpServletRequest request){
        WebUser user = (WebUser) request.getSession().getAttribute("user");
        ta.setTalkuserid(user.getUserid());
        commentService.addTalk(ta);
    }


}
