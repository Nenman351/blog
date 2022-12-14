//package com.africa.semicolon.blog.datas.repositories;
//
//import com.africa.semicolon.blog.datas.models.Comment;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CommentRepositoryImpl implements CommentRepository{
//
//    private List<Comment> comments = new ArrayList<>();
//    private static int commentId;
//
//    @Override
//    public Comment save(Comment comment) {
//        if (comment.getId() != 0) update(comment);
//        else {
//            comments.add(comment);
//            commentId++;
//            comment.setId(commentId);
//        }
//        return comment;
//    }
//
//    private void update(Comment comment){
//        Comment savedComment = findById(comment.getId());
//        savedComment.setComment(comment.getComment());
//    }
//
//    @Override
//    public Comment findById(int id) {
//        for (Comment comment: comments) if (comment.getId() == id) return comment;
//        return null;
//    }
//
//    @Override
//    public List<Comment> findAll() {
//        return comments;
//    }
//
//    @Override
//    public long count() {
//        return comments.size();
//    }
//
//    @Override
//    public void delete(Comment comment) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//        for (Comment comment:comments){
//            if (comment.getId() == commentId){
//                comments.remove(comment);
//                break;
//            }
//        }
//
//    }
//}
