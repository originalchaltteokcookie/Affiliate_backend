package com.project222.affiliate_mapper.View;

import com.project222.affiliate_mapper.Model.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedList;

@Mapper
public interface notice_mapper {
    @Select("SELECT * FROM notice WHERE id=#{user_id};")
    LinkedList<Notice> getNotice(@Param("id") String id);
}
