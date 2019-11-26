package com.zhg.javakc.modules.mdata.msrelation.controller;

import com.zhg.javakc.modules.mdata.msrelation.service.MSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView queryMS(){
        ModelAndView modelAndView = new ModelAndView("msrelation/list");
        return modelAndView;
    }





}
