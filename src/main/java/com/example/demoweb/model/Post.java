package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Date creationDate;

    private Integer likes;

    public Post(String text, Date creationDate)
    {
        this.text=text;
        this.creationDate = creationDate;
        this.likes=0;
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


}
