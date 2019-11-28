package com.zhg.javakc.modules.mdata.sales.date.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.mdata.sales.date.entity.DateEntity;
import com.zhg.javakc.modules.mdata.sales.date.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wang
 * @date 2019.11.25
 */

@Controller
@RequestMapping("/date")
public class DateController {

    @Autowired
    DateService dateService;

    @RequestMapping("/queryDate")
    public ModelAndView queryDate(DateEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/sales/price/updatelist");
        //分页查询
        Page<DateEntity> page =dateService.queryDate(entity, new Page<DateEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        DateEntity dateEntity = dateService.get(ids);
        modelMap.put("dateEntity",dateEntity);
        return "/mdata/sales/date/list";
      //  return "redirect:/sales/queryPrice.do";
    }

    @RequestMapping("/update")
    public String update(DateEntity testEntity){
        dateService.update(testEntity);
        return "redirect:/sales/queryDate.do";
    }

}
