package com.example.demo.controller;

import com.example.demo.entity.forum;
import com.example.demo.service.forumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class forumController {
    @Autowired
    private forumService forumService;

    @RequestMapping(path = "/forum_page",method = RequestMethod.GET)
    public String getForumPage(Model model){
        List<forum> list=forumService.findForum(1,0,10);
        List<Map<String,Object>> forumList=new ArrayList<>();
        if (list!=null){
            for (forum post:list){
                Map<String,Object> map=new HashMap<>();
                map.put("post",post);
                forumList.add(map);
            }
        }
        model.addAttribute("forumList",forumList);
        return "/forum_page";
    }

}
