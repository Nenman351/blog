package com.africa.semicolon.blog.dtos.requests;

import lombok.Data;

@Data
public class CreatePostRequest {
    private String title;
    private String body;
    private String id;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
}
