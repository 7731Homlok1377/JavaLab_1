package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class PostService {
    private ArrayList<Post> posts= new ArrayList<>(Arrays.asList(new Post(0l,"Тут был хороший борщ, с капусткой, но не красный", new Date()),
            new Post(1l,"А сегодня в завтрашний день не все смотреть могут", new Date()),
            new Post(2l,"В жизни полно лжи и грязи, она не так красива. Даже твой лучший друг может не поделиться пивом", new Date())));
    public List<Post> listAllPosts(){

        return posts;
    }

    public void create(String text) {
        Long count= posts.stream().count();
        posts.add(new Post(count,text, new Date()));
    }
}
