package com.zhg.javakc.modules.mdata.price_table.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.mdata.price_table.entity.PriceEntity;
import com.zhg.javakc.modules.mdata.price_table.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/price")
public class PriceController {
    @Autowired
    PriceService priceService;

    @RequestMapping("/queryPrice")
    public ModelAndView queryPrice(PriceEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/listprice");
        //分页查询
        Page<PriceEntity> page =priceService.queryPrice(entity, new Page<PriceEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面

        return modelAndView;
    }

}
