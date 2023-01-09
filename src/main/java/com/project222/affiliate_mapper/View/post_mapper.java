package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface post_mapper {
    @Select("SELECT * FROM post WHERE category = #{id};")
    List<Post> getPostInfo(@Param("id")int id);

    @Select("SELECT * FROM post WHERE market_id = #{market_id} LIMIT 1;")
    Post getPostInfoById(@Param("id")int id);
}