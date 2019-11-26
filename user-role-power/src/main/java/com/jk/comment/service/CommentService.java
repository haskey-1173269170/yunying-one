package com.jk.comment.service;

import com.jk.comment.model.Talk;

import java.util.List;
import java.util.Map;

public interface CommentService {

    Map queryComment(Integer page, Integer rows, Talk talk);

    List queryNewTalk();

    void delTalk(String id);

    void addTalk(Talk ta);
}
