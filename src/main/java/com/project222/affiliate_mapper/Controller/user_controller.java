package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Post;
import com.project222.affiliate_mapper.Model.UserShortModel;
import com.project222.affiliate_mapper.Model.user;
import com.project222.affiliate_mapper.View.user_mapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
public class user_controller {
    user_mapper mapper;
    public user_controller(user_mapper mapper){
        this.mapper = mapper;
    }

    @PutMapping("/user/register/{id}/{password}/{name}")
    public boolean insertUser(@PathVariable String id, @PathVariable String password, @PathVariable String name){
        return mapper.insertUser(id,password,name);
    }

    @GetMapping("/user/{id}")
    public boolean checkID(@PathVariable String id){
        return mapper.checkID(id) > 0;
    }

    @PostMapping("/user/login")
    @ResponseBody
    public boolean Login(@RequestBody UserShortModel model){
        return mapper.Login(model.getId(), model.getPassword()) > 0;
    }

}