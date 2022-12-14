package com.africa.semicolon.blog.services;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.dtos.requests.CreateCommentRequest;
import com.africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentServiceImplTest {
    private CommentService commentService;
    private PostService postService;

    @BeforeEach
    void setUp() {

        commentService = new CommentServiceImpl();
        postService = new PostServiceImpl();
    }

    @Test public void createCommentTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setTitle("Title");
        createPostRequest.setBody("Body");
        postService.createPost(createPostRequest);

        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        createCommentRequest.setCommenterName("Mo");
        createCommentRequest.setComment("new comment");
        createCommentRequest.setPostId("1");
        commentService.createComment(createCommentRequest);
        assertEquals(1, commentService.viewAllComment().size());
    }

//    @Test
//    public void createCommentTest(){
//        Comment comment = new Comment();
//        comment.setComment("I love beans");
//        comment.setCommenterName("Rejoice");
//        commentService.createComment(String.valueOf(comment));
//        assertEquals(1,commentService.viewAllComment().size());
//    }
//
//    @Test
//    public void viewCommentTest(){
//        Comment comment = new Comment();
//        comment.setComment("I love beans");
//        comment.setCommenterName("Rejoice");
//        comment.setComment("New comment");
//        commentService.createComment(String.valueOf(comment));
//        assertEquals(1,commentService.viewAllComment().size());

//        Comment comment1 = commentService.viewComment(1);
//        assertEquals("New comment", comment1.getComment());
//        assertEquals("I love beans", comment1.getComment());
//    }

}