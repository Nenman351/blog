package com.africa.semicolon.blog.datas.repositories;

import com.africa.semicolon.blog.datas.models.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepositoryImplTest {
    PostRepository postRepository;

    @BeforeEach
    public void setUp(){
        postRepository = new PostRepositoryImpl();
    }

    @Test
    public void saveNewPost_countShouldBeOne_Test(){
        Post post = new Post();
        post.setBody("Our story");
        post.setTitle("Story");

        Post post1 = new Post();
        post1.setBody("Our own Story");
        post1.setTitle("Our own story");

        postRepository.save(post);
        postRepository.save(post1);
        assertEquals(2L,postRepository.count());

    }

    @Test
    public void saveNewPost_findById_shouldReturnSavedPostTest(){
        Post post = new Post();
        post.setBody("Our story");
        post.setTitle("Story");

        postRepository.save(post);
        assertEquals(1L,postRepository.count());

        Post savedPost = postRepository.findById(1);
        assertEquals(post, savedPost);
        Post post2 = new Post();
        postRepository.save(post2);
        assertEquals(post2, postRepository.findById(2));
    }

    @Test
    public void savePost_updatePost_countIsOneTest(){
        Post post = new Post();
        post.setBody("Our story");
        post.setTitle("Story");
        postRepository.save(post);

        Post updatedPost = new Post();
        updatedPost.setId(1);
        updatedPost.setBody("Updated Body");
        updatedPost.setTitle("Updated Title");
        postRepository.save(updatedPost);
        assertEquals(1L, postRepository.count());
        assertEquals(post, postRepository.findById(1));
        assertEquals("Updated Body", post.getBody());
        assertEquals("Updated Title", post.getTitle());

    }

    @Test
    public void deleteItem(){
//        Post post = new Post();
//        post.setBody("Our story");
//        post.setTitle("Story");
//
//
//
//        postRepository.save(post);
//        assertEquals(1L,postRepository.count());

        saveNewPost_countShouldBeOne_Test();
        postRepository.delete(1);
        assertEquals(1L, postRepository.count());

    }
}