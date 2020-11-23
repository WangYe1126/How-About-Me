package com.example.demo;

import com.example.demo.dao.forumMapper;
import com.example.demo.entity.forum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MapperTests {
    @Autowired
    private forumMapper forumMapper;
    @Test
    public void testSeclectForum(){
        List<forum> list=forumMapper.selectForum(0,0,10);
        for (forum post:list){
            System.out.println(post);
        }
    }
}
