package com.africa.semicolon.blog.services;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.datas.repositories.CommentRepository;
import com.africa.semicolon.blog.dtos.requests.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostService postService;
//    @Override
//    public void createComment(String comment1) {
//        Comment comment = new Comment();
//        comment.setComment(comment.getComment());
//        comment.setCommenterName(comment.getCommenterName());
//        commentRepository.save(comment);
//
//    }

    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setCommenterName(createCommentRequest.getCommenterName());
        Comment savedComment = commentRepository.save(comment);
        postService.addComment(createCommentRequest.getPostId(), savedComment);

    }

//    @Override
//    public void updatePost(String id, String comment) {
//    }

//    @Override
//    public void delete(String id) {
//
//    }

//    @Override
//    public Comment viewComment(String id) {
//        return commentRepository.findPostById(id);
//    }

    @Override
    public List<Comment> viewAllComment() {
        return commentRepository.findAll();
    }
}
