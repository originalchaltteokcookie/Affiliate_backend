package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Favorite;
import com.project222.affiliate_mapper.View.favorite_mapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class favorite_controller {
    favorite_mapper mapper;
    public favorite_controller(favorite_mapper mapper){this.mapper = mapper;}

    @PutMapping("/favorite/addFavorite/{id}/{date}/{market_name}/{market_info")
    public boolean insertFavorite(@PathVariable String id, @PathVariable String date, @PathVariable String market_name, @PathVariable String market_info){
        return mapper.insertFavorite(id, date, market_name, market_info);
    }

    @GetMapping("/favorite/getFavorite/{id}")
    public LinkedList<Favorite> getFavorite(@PathVariable String id){
        return mapper.getFavorite(id);
    }
}