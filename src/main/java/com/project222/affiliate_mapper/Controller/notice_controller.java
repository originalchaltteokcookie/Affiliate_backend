package com.project222.affiliate_mapper.Controller;

import com.project222.affiliate_mapper.Model.Notice;
import com.project222.affiliate_mapper.View.notice_mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController

public class notice_controller {
    notice_mapper mapper;

    public notice_controller(notice_mapper mapper){this.mapper=mapper;}

    @GetMapping("notice/getNotice/{id}")
    public LinkedList<Notice> getNotice(@PathVariable String id){
        return mapper.getNotice(id);
    }
}
