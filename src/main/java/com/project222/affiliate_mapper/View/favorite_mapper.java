package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Favorite;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface favorite_mapper {
    @Insert("INSERT INTO favorite VALUES (#{user_id}, #{market_id}, #{market_name});")
    boolean insertFavorite(@Param("id")String id, @Param("market_id")int market_id, @Param("market_name") String market_name);

    @Select("SELECT * FROM favorite WHERE id=#{user_id};")
    List<Favorite> getFavorite(@Param("id")String id);

}
