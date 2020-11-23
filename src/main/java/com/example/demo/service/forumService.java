package com.example.demo.service;

import com.example.demo.dao.forumMapper;
import com.example.demo.entity.forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class forumService {
    @Autowired
    private forumMapper forummapper;


    public List<forum> findForum(int U_No,int offset,int limit){
        return forummapper.selectForum(U_No,offset,limit);
    }

    public int findForumRows(int U_No){
        return forummapper.selectForumRows(U_No);
    }

}
