package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Review;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface review_mapper {
    @Insert("INSERT INTO review VALUES (#{user_id}, #{market_id}, #{market_name}, #{review_text});")
    boolean insertReview(@Param("id")String id, @Param("market_id")int market_id, @Param("market_name") String market_name, @Param("review_text")String review_text);

    @Select("SELECT * FROM review WHERE id=#{user_id};")
    List<Review> getReview(@Param("id")String id);

    @Select("SELECT * FROM review WHERE id=#{market_id};")
    List<Review> getReview(@Param("id")int id);
}
