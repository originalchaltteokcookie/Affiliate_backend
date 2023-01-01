package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.user;
import com.project222.affiliate_mapper.View.user_mapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class user_controller {
    user_mapper mapper;
    public user_controller(user_mapper mapper){
        this.mapper=mapper;
    }

    @GetMapping("/user/register")
    @ResponseBody
    boolean insertUser(@RequestBody user User){
        return mapper.insertUser(User.getId(),User.getPassword(), User.getName());
    }
    @GetMapping("/user/{id}")
    int checkID(String id){return mapper.checkID(id);}
}
