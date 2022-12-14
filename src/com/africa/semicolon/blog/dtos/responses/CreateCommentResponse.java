package com.africa.semicolon.blog.dtos.responses;

public class CreateCommentResponse {
    private String comment;
    private String commenterName;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }
}
