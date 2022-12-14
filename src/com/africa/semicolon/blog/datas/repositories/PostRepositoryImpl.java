//package com.africa.semicolon.blog.datas.repositories;
//
//import com.africa.semicolon.blog.datas.models.Post;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PostRepositoryImpl implements PostRepository{
//
//    private List<Post> postDb = new ArrayList<>();
//    private static int id;
//    @Override
//    public Post save(Post post) {
//        if (post.getId() != 0) update(post);
//        else {
//            postDb.add(post);
//            id++;
//            post.setId(id);
//        }
//        return post;
//    }
//
//    private void update(Post post){
////        find original
//        Post savedPost = findById(post.getId());
//        savedPost.setTitle(post.getTitle());
//        savedPost.setBody(post.getBody());
////        set original with new details
//    }
//
//    @Override
//    public Post findById(int id) {
//        for (var post : postDb) if (post.getId() == id) return post;
//
//        return null;
//    }
//
//    @Override
//    public List<Post> findAll() {
//        return postDb;
//    }
//
//    @Override
//    public long count() {
//        return postDb.size();
//    }
//
//    @Override
//    public void delete(Post post) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//        for (Post post:postDb){
//            if (post.getId() == id){
//                postDb.remove(post);
//                break;
//            }
//        }
//    }
//}
