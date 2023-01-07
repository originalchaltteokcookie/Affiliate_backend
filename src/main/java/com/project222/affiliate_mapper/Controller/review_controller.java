package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Review;
import com.project222.affiliate_mapper.View.review_mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class review_controller {
    review_mapper mapper;
    public review_controller(review_mapper mapper){this.mapper=mapper;}

    @PutMapping("/review/addReview/{id}/{market_id}/{market_name}/{review_text}")
    public boolean insertReview(@PathVariable String id, @PathVariable int market_id, @PathVariable String market_name, @PathVariable String review_text){
        return mapper.insertReview(id, market_id, market_name, review_text);
    }
    @GetMapping("review/getReview/{id}")
    public List<Review> getReview(@PathVariable String id){
        return mapper.getReview(id);
    }

    @GetMapping("review/getReview/{market_id)}")
    public List<Review> getReview(@PathVariable int market_id){
        return mapper.getReview(market_id);
    }


}
