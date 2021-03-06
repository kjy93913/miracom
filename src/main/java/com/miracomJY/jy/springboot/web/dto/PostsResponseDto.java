package com.miracomJY.jy.springboot.web.dto;


import com.miracomJY.jy.springboot.domain.posts.Posts;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id =entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author= entity.getAuthor();

    }
}
