package com.jk.comment.mapper;

import com.jk.comment.model.Talk;

import java.util.List;

public interface CommentMapper {

    List<Talk> queryComment(Talk talk);

    List queryNewTalk();


    void delTalk(String id);

    void addTalk(Talk talk);
}
