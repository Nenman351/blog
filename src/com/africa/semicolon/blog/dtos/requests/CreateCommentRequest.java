package com.africa.semicolon.blog.dtos.requests;

import lombok.*;

//@Getter
//@Setter
//@ToString
@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
public class CreateCommentRequest {
    private String postId;
    private String commenterName;
    private String comment;
}
