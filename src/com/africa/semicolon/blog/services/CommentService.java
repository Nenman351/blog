package com.africa.semicolon.blog.services;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.dtos.requests.CreateCommentRequest;

import java.util.List;

public interface CommentService {

    void createComment(CreateCommentRequest createCommentRequest);
//    void updatePost(String id, String comment);
//    void delete(String id);
//    Comment viewComment(String id);

    List<Comment> viewAllComment();
}
