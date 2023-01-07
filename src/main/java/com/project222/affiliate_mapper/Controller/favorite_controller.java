package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Favorite;
import com.project222.affiliate_mapper.View.favorite_mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class favorite_controller {
    favorite_mapper mapper;
    public favorite_controller(favorite_mapper mapper){this.mapper = mapper;}

    @PutMapping("/favorite/addFavorite/{id}/{market_id}/{market_name")
    public boolean insertFavorite(@PathVariable String id, @PathVariable int market_id, @PathVariable String market_name){
        return mapper.insertFavorite(id, market_id, market_name);
    }

    @GetMapping("/favorite/getFavorite/{id}")
    public List<Favorite> getFavorite(@PathVariable String id){
        return mapper.getFavorite(id);
    }
}