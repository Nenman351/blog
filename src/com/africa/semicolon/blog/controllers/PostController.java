package com.africa.semicolon.blog.controllers;

import com.africa.semicolon.blog.datas.models.Post;
import com.africa.semicolon.blog.dtos.requests.CreatePostRequest;
import com.africa.semicolon.blog.services.PostService;
import com.africa.semicolon.blog.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class PostController {
    @Autowired
    private PostService postService;


    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postService.createPost(createPostRequest);
        return "Successful";
    }

    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable String postId){
        return postService.viewPost(postId);
    }
}
