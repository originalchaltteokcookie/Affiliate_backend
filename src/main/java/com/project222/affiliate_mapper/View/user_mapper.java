package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface user_mapper {
    @Insert("INSERT INTO user VALUES (#{id}, #{password}, #{name});")
    boolean insertUser(@Param("id")String id, @Param("password")String pw, @Param("name")String name);
    @Select("SELECT COUNT(*) FROM user WHERE id=#{id};")
    int checkID(@Param("id")String id);
    @Select("SELECT COUNT(*) FROM user WHERE id=#{id} AND password=#{password};")
    int Login(@Param("id")String id, @Param("password")String pw);
    @Select("SELECT name FROM user WHERE id=#{id};")
    String getUserName(@Param("id")String id);
}