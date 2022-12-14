package com.africa.semicolon.blog.datas.repositories;

import com.africa.semicolon.blog.datas.models.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentRepositoryImplTest {

    CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    public void saveNewComment_countShouldBeOne_Test(){
        Comment comment = new Comment();
        comment.setComment("I love beans.");

        commentRepository.save(comment);
        assertEquals(1L,commentRepository.count());
    }

    @Test
    public void savedNewComment_findById_shouldReturnSavedCommentTest(){
        Comment comment = new Comment();
        comment.setComment("I love beans.");

        commentRepository.save(comment);
        assertEquals(1L,commentRepository.count());

        Comment savedComment = commentRepository.findById(1);
        assertEquals(comment, savedComment);
        Comment comment1 = new Comment();
        commentRepository.save(comment1);
        assertEquals(comment1, commentRepository.findById(2));
    }

    @Test
    public void saveComment_updateComment_countIsOneTest(){
        Comment comment = new Comment();
        comment.setComment("I love beans.");
        comment.setCommenterName("Rejoice");

        commentRepository.save(comment);

        Comment updateComment = new Comment();
        updateComment.setId(1);
        updateComment.setComment("Updated Comment");
        updateComment.setCommenterName("Rejoice");
        commentRepository.save(updateComment);
        assertEquals(1L, commentRepository.count());
        assertEquals(comment, commentRepository.findById(1));
        assertEquals("Updated Comment", comment.getComment());
        assertEquals("Rejoice", comment.getCommenterName());
    }

    @Test
    public void deleteItemTest(){
        Comment comment = new Comment();
        comment.setComment("I love beans");
        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());
        commentRepository.delete(1);
        assertEquals(0L, commentRepository.count());
    }
}