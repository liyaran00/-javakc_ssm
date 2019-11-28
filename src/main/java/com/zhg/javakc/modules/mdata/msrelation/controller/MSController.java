package com.zhg.javakc.modules.mdata.msrelation.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.mdata.msrelation.entity.MSEntity;
import com.zhg.javakc.modules.mdata.msrelation.service.MSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/26 11:31
 */
@Controller
@RequestMapping("ms")
public class MSController {

    @Autowired
    private MSService msService;

    @RequestMapping("queryMS")
    public ModelAndView queryMS(MSEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/msrelation/list");
        //分页查询
        Page<MSEntity> page =msService.queryMS(entity, new Page<MSEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }





}
