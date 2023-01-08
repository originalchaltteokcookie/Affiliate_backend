package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Favorite;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedList;
import java.util.List;

@Mapper
public interface favorite_mapper {
    @Insert("INSERT INTO favorite VALUES (#{user_id}, #{date}, #{market_name}, #{market_info});")
    boolean insertFavorite(@Param("id")String id, @Param("date")String date, @Param("market_name") String market_name, @Param("market_info")String market_info);

    @Select("SELECT * FROM favorite WHERE id=#{user_id};")
    LinkedList<Favorite> getFavorite(@Param("id")String id);

}
