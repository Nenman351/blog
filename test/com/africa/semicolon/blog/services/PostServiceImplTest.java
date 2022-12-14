package com.africa.semicolon.blog.services;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.datas.models.Post;
import com.africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PostServiceImplTest {
    private PostService postService;

    @BeforeEach
    public void setUp() {
        postService = new PostServiceImpl();
    }

    @Test
    public void createPostTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New Post");
        postService.createPost(createPostRequest);

        assertEquals(1, postService.viewAllPost().size());
    }

    @Test
    public void viewPostTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New post");
        postService.createPost(createPostRequest);
        assertEquals(1, postService.viewAllPost().size());

        Post post = postService.viewPost("1");
        assertEquals("New post",post.getTitle());
        assertEquals("Egusi is my best soup", post.getBody());
        assertNotNull(post.getCreationTime());
    }

    @Test public void addComment(){
//        given I have a saved post
//        given I have a comment
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody(" Post Body");
        createPostRequest.setTitle("Post Title");
        postService.createPost(createPostRequest);
        Comment comment = new Comment();
        comment.setComment("I love your post");
        postService.addComment("1",comment);

        Post savedPost = postService.viewPost("1");
        assertEquals(1,savedPost.getComments().size());
        assertEquals("I love your post", savedPost.getComments().get(0).getComment());


    }
}