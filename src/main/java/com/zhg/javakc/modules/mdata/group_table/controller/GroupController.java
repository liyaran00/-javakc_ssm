package com.zhg.javakc.modules.mdata.group_table.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.mdata.group_table.entity.GroupEntity;
import com.zhg.javakc.modules.mdata.group_table.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/group")
public class GroupController {
     @Autowired
      GroupService groupService;


    @RequestMapping("/queryGroup")
    public ModelAndView queryTest(GroupEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/list");
        //分页查询
        Page<GroupEntity> page =groupService.queryGroup(entity, new Page<GroupEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }


}
