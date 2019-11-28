package com.zhg.javakc.modules.mdata.sales.price.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.mdata.sales.date.entity.DateEntity;
import com.zhg.javakc.modules.mdata.sales.date.service.DateService;
import com.zhg.javakc.modules.mdata.sales.price.entity.SalesEntity;
import com.zhg.javakc.modules.mdata.sales.price.service.SalesService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.json.Json;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/19 14:56
 */
@Controller
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @Autowired
    DateService dateService;


    @RequestMapping("/queryPrice")
    public ModelAndView queryPrice(SalesEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/mdata/sales/price/list/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/sales/price/list");
        //分页查询
        Page<SalesEntity> page = salesService.queryPrice(entity, new Page<SalesEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }


    @RequestMapping("/create")
    public String create(DateEntity dateEntity){
        //设置ID
        dateEntity.setSalesPriceDateId(CommonUtil.uuid());
        //新增数据
        dateService.save(dateEntity);
        //重定向到查询页面
        return "redirect:/sales/queryPrice.do";
    }











//    @RequestMapping("/view")
//    public String view(String ids, ModelMap modelMap){
//        SalesEntity salesEntity = salesService.get(ids);
//        modelMap.put("salesEntity", salesEntity);
//        return "test/update";
//    }
//
//    @RequestMapping("/update")
//    public String update(SalesEntity salesEntity){
//        salesService.update(salesEntity);
//        return "redirect:queryTest.do";
//    }
//
//    @RequestMapping("/delete")
//    public String delete(String[] ids){
//        salesService.delete(ids);
//        return "redirect:queryTest.do";
//    }

}


