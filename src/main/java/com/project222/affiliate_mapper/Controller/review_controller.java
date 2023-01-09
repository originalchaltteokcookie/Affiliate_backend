package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Review;
import com.project222.affiliate_mapper.View.review_mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class review_controller {
    review_mapper mapper;
    public review_controller(review_mapper mapper){this.mapper=mapper;}

    @PutMapping("/review/addReview/{user_name}/{market_name}/{date}/{review_text}")
    public boolean insertReview(@PathVariable String user_name, @PathVariable String market_name, @PathVariable String date, @PathVariable String review_text){
        return mapper.insertReview(user_name, market_name, date, review_text);
    }
    @GetMapping("/review/getReview_user_name/{user_name}")
    public LinkedList<Review> getReview_user_name(@PathVariable String user_name){
        return mapper.getReview_user_name(user_name);
    }

    @GetMapping("/review/getReview/{market_name}")
    public LinkedList<Review> getReview(@PathVariable String market_name){
        return mapper.getReview(market_name);
    }
}
