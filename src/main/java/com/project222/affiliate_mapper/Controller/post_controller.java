package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Post;
import com.project222.affiliate_mapper.View.post_mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class post_controller {
    post_mapper mapper;

    public post_controller(post_mapper mapper){this.mapper=mapper;}

    @GetMapping("/postList/{category}")
    public List<Post> getPostInfo(@PathVariable int category){
        return mapper.getPostInfo(category);
    }

    @GetMapping("/post/{market_id}")
    public Post getPostById(@PathVariable int market_id){
        return mapper.getPostInfoById(market_id);
    }
}