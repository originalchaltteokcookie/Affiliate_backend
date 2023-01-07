package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface post_mapper {
    @Select("SELECT * FROM post WHERE category = #{id};")
    List<Post> getPostInfo(@Param("id")int id);

}