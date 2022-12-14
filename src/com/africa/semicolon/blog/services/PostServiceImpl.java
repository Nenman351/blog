package com.africa.semicolon.blog.services;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.datas.models.Post;
import com.africa.semicolon.blog.datas.repositories.PostRepository;
import com.africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostServiceImpl implements PostService{

   @Autowired
   private  PostRepository postRepository;
    @Override
    public Post createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);
        return post;
    }

    @Override
    public void updatePost(CreatePostRequest createPostRequest) {

    }

    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPost(String id) {
        return postRepository.findPostById("id");
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(String postId, Comment comment) {
        Post savedPost = postRepository.findPostById(postId);
        savedPost.getComments().add(comment);
        postRepository.save(savedPost);
    }

}
