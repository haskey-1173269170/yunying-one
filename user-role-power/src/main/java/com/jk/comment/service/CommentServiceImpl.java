package com.jk.comment.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.comment.mapper.CommentMapper;
import com.jk.comment.model.Talk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl  implements  CommentService{

    @Autowired
    private CommentMapper commentMapper;
    @Override
    public Map queryComment(Integer page, Integer rows, Talk talk) {
        Page<Talk> objects = PageHelper.startPage(page, rows);
        List<Talk> list=commentMapper.queryComment(talk);
        Map m = new HashMap();
        m.put("rows",list);
        m.put("total",objects.getTotal());
        return m;
    }

    @Override
    public List queryNewTalk() {
        List list=commentMapper.queryNewTalk();
        return list;
    }

    @Override
    public void delTalk(String id) {
        commentMapper.delTalk(id);
    }

    @Override
    public void addTalk(Talk talk) {
        commentMapper.addTalk(talk);
    }
}
