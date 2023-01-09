package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Review;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedList;
import java.util.List;

@Mapper
public interface review_mapper {
    @Insert("INSERT INTO review VALUES (#{user_name}, #{market_name}, #{date}, #{review_text});")
    boolean insertReview(@Param("name")String user_name, @Param("market_name") String market_name, @Param("date")String date, @Param("review_text")String review_text);

    @Select("SELECT * FROM review WHERE id=#{user_name};")
    LinkedList<Review> getReview_user_name(@Param("name")String user_name);

    @Select("SELECT * FROM review WHERE market_name=#{market_name};")
    LinkedList<Review> getReview(@Param("market_name")String market_name);

}
