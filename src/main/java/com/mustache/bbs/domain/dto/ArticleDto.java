package com.mustache.bbs.domain.dto;

public class ArticleDto {

    private Long id;
    private String title;
    private String content;

    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString(){
        return "ArticleDto{" + "id=" + null + ", " + "title=" + title + ", " + "content=" + content + "}";
    }
}