package com.africa.semicolon.blog.datas.repositories;

import com.africa.semicolon.blog.datas.models.Comment;
import com.africa.semicolon.blog.datas.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CommentRepository extends MongoRepository<Comment, String> {
//    Post findPostById(String id);

//    Comment save(Comment comment);
//    Comment findById(int id);
//    List<Comment> findAll();
//    long count();
//    void delete(Comment comment);
//    void delete(int id);
}
