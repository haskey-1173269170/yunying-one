package com.jk.comment.controller;

import com.jk.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("comment")
public class toController {

    @Autowired
    private CommentService commentService;
    @RequestMapping("toQueryComment")
    public String toQueryComment(){

        return "comment/showComment";
    }
    @RequestMapping("toShowCommentInfo")
    public String toShowCommentInfo(String talkid, Model model){
        List list = commentService.queryNewTalk();
        model.addAttribute("list",list);
        return "comment/commentDiaLog";
    }
    @RequestMapping("toAddComment")
    public String toAddComment(){
        return "comment/addComment";
    }

}
