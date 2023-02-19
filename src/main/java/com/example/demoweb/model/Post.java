package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private Long id;
    private String text;
    private Date creationDate;

    private Integer likes;

    public Post(Long id, String text, Date creationDate)
    {
        this.text=text;
        this.creationDate = creationDate;
        this.likes=0;
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public Long getId(){ return id; }
    public void setLikes(int likes){ this.likes=likes; }





}
