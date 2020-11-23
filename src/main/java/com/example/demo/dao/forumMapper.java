package com.example.demo.dao;

import com.example.demo.entity.forum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface forumMapper {
    List<forum> selectForum(int U_No,int offset,int limit);
    //@Param注解用于给参数取别名，如果只有一个参数，并且在<if>中使用必须加别名
    int selectForumRows(@Param("U_No") int U_No);
}
