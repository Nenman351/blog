package com.africa.semicolon.blog.datas.repositories;

import com.africa.semicolon.blog.datas.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    Post findPostById(String id);

//    Post save(Post post);
//    Post findById(int id);
//    List<Post> findAll();
//    long count();
//    void delete(Post post);
//    void delete(int id);
}
