package com.africa.semicolon.blog.services;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.datas.models.Post;
import com.africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    
    Post createPost(CreatePostRequest createPostRequest);
    void updatePost(CreatePostRequest createPostRequest);
    void deletePost(String id);
    Post viewPost(String id);


    List<Post> viewAllPost();

    void addComment(String postId, Comment comment);
}
