package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post p1=new Post("Тут был хороший борщ, с капусткой, но не красный");
        Post p2 =new Post("А сегодня в завтрашний день не все смотреть могут");
        Post p3= new Post("В жизни полно лжи и грязи, она не так красива. Даже твой лучший друг может не поделиться пивом");
        return Arrays.asList(p1,p2,p3);
    }
}
